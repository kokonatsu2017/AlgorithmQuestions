package Easy;

import java.util.List;

import lib.Employee;

/**
 * LeetCode 690
 * @author kokonatsudream
 *
 */
public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
		int importance = 0;
	
		Employee target = null;
        for(Employee e : employees){
        	if(e.id == id)
        		target = e;
        }
        
        for(int sub : target.subordinates){
        	importance += getImportance(employees, sub);
        }
        importance += target.importance;
        
        return importance;
        
    }
}
