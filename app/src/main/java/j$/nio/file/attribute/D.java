package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes3.dex */
public final /* synthetic */ class D {
    public final /* synthetic */ UserPrincipalLookupService a;

    public D(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
