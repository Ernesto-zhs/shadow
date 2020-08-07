package com.zhs.shadow.admin;

import java.util.*;
import javax.xml.transform.Result;

import lombok.Data;

import org.springframework.web.bind.annotation.RequestParam;

public class TestHH {

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();


        String sql = getSqlString(list, "tb_name", new HashMap<String, Object>());
        System.out.println(sql);
    }

    private static String getSqlString(List<Map<String, Object>> list, String tableName, Map<String, Object> columnMap) {
        StringBuilder sqlSb = new StringBuilder("INSERT INTO ").append(tableName).append("VALUES");
        int i = 0;
        for (Map<String, Object> map : list) {
            i++;
            StringBuilder valueSb = new StringBuilder();
            int index = 0;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                index++;
                valueSb.append(entry.getValue());
                if (index < map.size() - 1) {
                    valueSb.append(",");
                }
            }
            sqlSb.append("(").append(valueSb).append(")");
            if (i < list.size() - 1) {
                sqlSb.append(",");
            } else {
                sqlSb.append(";");
            }
        }
        return sqlSb.toString();
    }

    public static Result getCodeByCodeSortName(@RequestParam String codeSortName) {
        PCodeService pCodeService = new PCodeService();
        List<IPCode> list = pCodeService.getCodeByCodeSortName(codeSortName);
        for (IPCode ipCode : list) {
            String parentId = ipCode.getParentId();
            List<IPCode> list1 = pCodeService.getCodeByParentId(parentId);
            ipCode.setChildren(list1);
        }
        return ResultUtil.success(list);
//        List<List<IPCode>> list1 = new ArrayList<>();
//        String parentId = "";
//        for (int i = 0; i < list.size(); i++) {
//            IPCode ipCode = list.get(i);
//            parentId = ipCode.getParentId();
//            list1 = pCodeService.getCodeByParentId(parentId);
//            list1.add(list);
//        }
    }


}

@Data
class IPCode {

    private String parentId;

    private List<IPCode> children;

}

class PCodeService {

    public List<IPCode> getCodeByCodeSortName(String codeSortName) {
        return null;
    }

    public List<IPCode> getCodeByParentId(String parentId) {
        return null;
    }
}

class ResultUtil {

    public static Result success(Object o) {
        return null;
    }
}