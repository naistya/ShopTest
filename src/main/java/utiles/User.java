package utiles;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    @Builder.Default
    public String Firstname = "Anastasia";
    @Builder.Default
    public String Lastname = "Pavlova";
    @Builder.Default
    public String PostalCode = "07405";
    @Builder.Default
    private String email = "standard_user";
    @Builder.Default
    private String password = "secret_sauce";
}
