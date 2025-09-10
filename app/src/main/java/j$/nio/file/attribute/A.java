package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ A(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ C a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof B) {
            return ((B) userPrincipal).a;
        }
        if (!p.w(userPrincipal)) {
            return new A(userPrincipal);
        }
        GroupPrincipal groupPrincipalL = p.l(userPrincipal);
        if (groupPrincipalL == null) {
            return null;
        }
        return new v(groupPrincipalL);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
