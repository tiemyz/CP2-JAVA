module br.com.fiap {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.fiap to javafx.fxml;
    exports br.com.fiap;
}
