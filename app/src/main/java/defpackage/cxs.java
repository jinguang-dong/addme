package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxs {
    public static final cxx a = new cxe();

    public static final cxm a(Class cls, gno gnoVar) {
        return b(ske.ax(cls), gnoVar);
    }

    public static final cxm b(ukx ukxVar, gno gnoVar) {
        String strB = ukxVar.b();
        if (strB != null) {
            return gnoVar.j(ukxVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
