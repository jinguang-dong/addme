package j$.nio.file;

import java.nio.file.OpenOption;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements OpenOption {
    public final /* synthetic */ o a;

    public /* synthetic */ n(o oVar) {
        this.a = oVar;
    }

    public static /* synthetic */ OpenOption a(o oVar) {
        if (oVar == null) {
            return null;
        }
        if (oVar instanceof m) {
            return ((m) oVar).a;
        }
        if (!(oVar instanceof LinkOption)) {
            return oVar instanceof B ? D.a((B) oVar) : new n(oVar);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        o oVar = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
