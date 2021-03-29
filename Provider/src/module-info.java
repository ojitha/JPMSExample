// Provider
module Provider {
    requires Service;
    requires java.logging;
    provides com.github.ojitha.service.a.OjService
            with com.github.ojitha.provider.b.M;
}