package Business.Adapters.PersonService;

import Entities.Concrete.Customer;

public class MernisPersonManager implements PersonService{

	@Override
	public boolean VerifyCid(Customer customer) {
		
		String TcKimlikNo = customer.nationalityId;
		if(TcKimlikNo.length() == 11){
            int cift_top = 0;
            int tek_top = 0;
            for(int i = 1; i <= 9; i++){ 
                if(i%2 == 0){
                    cift_top = cift_top + (Integer.valueOf(String.valueOf(TcKimlikNo.charAt(i - 1))));
                }
                if(i%2 == 1){
                    tek_top = tek_top + (Integer.valueOf(String.valueOf(TcKimlikNo.charAt(i - 1))));
                }
            }
            int kontrol_1 = ((tek_top * 7) - cift_top) % 10; 
            int kontrol_2 = (tek_top + cift_top + (Integer.valueOf(String.valueOf(TcKimlikNo.charAt(9))))) % 10;  
            if(kontrol_1 == (Integer.valueOf(String.valueOf(TcKimlikNo.charAt(9)))) && kontrol_2 == (Integer.valueOf(String.valueOf(TcKimlikNo.charAt(10))))){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
		
	}

}
