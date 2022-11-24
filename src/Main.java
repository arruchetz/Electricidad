public class Main {
    public static void main(String[] args) {
        Autónomos selfemployed = new Autónomos();
        selfemployed.setCodcliente(1);
        selfemployed.setNombre("Daniel");
        selfemployed.setApellidos("Garcia");
        selfemployed.setDni("763432132K");
        selfemployed.setDirpostal("05001");
        selfemployed.setPoblacion("Ávila");
        selfemployed.setProvincia("Ávila");
        selfemployed.setEmail("daniel@gmail.com");
        selfemployed.setTelefono(879674321);

        System.out.println(selfemployed.getCodcliente());
        System.out.println(selfemployed.getNombre());
        System.out.println(selfemployed.getApellidos());
        System.out.println(selfemployed.getDni());
        System.out.println(selfemployed.getDirpostal());
        System.out.println(selfemployed.getPoblacion());
        System.out.println(selfemployed.getProvincia());
        System.out.println(selfemployed.getEmail());
        System.out.println(selfemployed.getTelefono());


        Facturas bills = new Facturas();
        bills.setCodfactura(213);
        bills.setFechafactura("10 de Noviembre 2022");
        bills.setCodcliente(1);
        bills.setCodproducto("17/8/2");
        bills.setCodservicio("Lopez");
        bills.setBaseimp("Calle Arroz");
        bills.setTotal("17/8/2000");

        System.out.println(bills.getCodfactura());
        System.out.println(bills.getFechafactura());
        System.out.println(bills.getCodcliente());
        System.out.println(bills.getCodproducto());
        System.out.println(bills.getCodservicio());
        System.out.println(bills.getBaseimp());
        System.out.println(bills.getTotal());


        Impresion print = new Impresion();
        print.setCodfacturas(1);
        print.setNifcliente("43267809G");
        print.setNombrecliente("Javier");
        print.setDircliente("Calle Juan Grande");
        print.setPoblacioncliente("Ávila");
        print.setProvinciacliente("Ávila");
        print.setBaseimp("4123v");
        print.setTotal("10543");

        System.out.println(print.getCodfacturas());
        System.out.println(print.getNifcliente());
        System.out.println(print.getNombrecliente());
        System.out.println(print.getDircliente());
        System.out.println(print.getPoblacioncliente());
        System.out.println(print.getProvinciacliente());
        System.out.println(print.getBaseimp());
        System.out.println(print.getTotal());


        Productos product = new Productos();
        product.setCodproducto(1);
        product.setNombre("Garcia");
        product.setMarca("70800900A");
        product.setModelo("");
        product.setPrecio("Garcia");
        product.setIva("70800900A");

        System.out.println(product.getCodproducto());
        System.out.println(product.getNombre());
        System.out.println(product.getMarca());
        System.out.println(product.getModelo());
        System.out.println(product.getPrecio());
        System.out.println(product.getIva());


        Servicios service = new Servicios();
        service.setCodcli(1);
        service.setNombre("Garcia");
        service.setMarca("70800900A");
        service.setModelo("");
        service.setPrecio("Garcia");
        service.setIva("70800900A");

        System.out.println(service.getCodcli());
        System.out.println(service.getNombre());
        System.out.println(service.getMarca());
        System.out.println(service.getModelo());
        System.out.println(service.getPrecio());
        System.out.println(service.getIva());


        Sociedades society = new Sociedades();
        society.setCodcliente(1);
        society.setRazonsocial("Daniel S.A");
        society.setCif(2);
        society.setDirpostal("Calle Juan Carlos I");
        society.setPoblacion("Ávila");
        society.setProvincia("Ávila");
        society.setEmail("danielg@gmail.com");
        society.setTelefono(141424262);

        System.out.println(society.getCodcliente());
        System.out.println(society.getRazonsocial());
        System.out.println(society.getCif());
        System.out.println(society.getDirpostal());
        System.out.println(society.getPoblacion());
        System.out.println(society.getProvincia());
        System.out.println(society.getEmail());
        System.out.println(society.getTelefono());
    }
}