package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class B implements UserPrincipal {
    public final /* synthetic */ C a;

    public /* synthetic */ B(C c) {
        this.a = c;
    }

    public static /* synthetic */ UserPrincipal a(C c) {
        if (c == null) {
            return null;
        }
        return c instanceof A ? ((A) c).a : c instanceof v ? ((v) c).a : new B(c);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        C c = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return c.equals(obj);
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
