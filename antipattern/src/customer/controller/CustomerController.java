class CustomerController {
    
    customerService CustomerService ; 
    
    Scanner sc = new Scanner(System.in);

    constructor(
        customerService CustomerService
    ){
        this.customerService = customerService ; 
    }

    public void createOrderInteractive(){

        System.out.print("Nom du client: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Téléphone: ");
        String phone = sc.nextLine();

        Customer createdCustomer = customerService.createCustomer(name, email , phone) ; 
        
        System.out.println("Client créé id=" + createdCustomer.id + " nom=" + createdCustomer.name);
    }

    
}