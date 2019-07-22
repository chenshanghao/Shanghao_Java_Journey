package OOP_Basic;

//1. 子类可以覆写父类的方法（Override），覆写在子类中改变了父类方法的行为；
//2. Java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态；
//3. final修饰符有多种作用：
//4. final修饰的方法可以阻止被覆写；
//5. final修饰的class可以阻止被继承；
//6. final修饰的field必须在创建对象时初始化，随后不可修改。
public class Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
            };
        System.out.println(totalTax(incomes));
	}
	
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}


	class Income{
		protected double income;
		
		public Income(double income) {
			this.income = income;
		}
		
		public double getTax() {
			return income * 0.1;    // tax rage 10%
		}	
	}

	class Salary extends Income{
		public Salary(double income) {
			super(income);
		}
		
	    @Override
		public double getTax() {
			if (income <= 5000) {
				return 0;
			}
			return (income - 5000) * 0.2;
		}
	}

	class StateCouncilSpecialAllowance extends Income{
		public StateCouncilSpecialAllowance(double income) {
			super(income);
		}
		@Override
		public double getTax() {
			return 0;
		}
	}
	
