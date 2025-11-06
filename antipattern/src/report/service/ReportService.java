
class ReportService{
    public ReportService(
        orderService OrderService

    ){

    }

    
    public String generateOrdersReport(String filename){

        Orders[] orders = orderService.findAll();
        
        return orders ;  
    }
}