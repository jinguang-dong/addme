package defpackage;

import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iyd implements uem {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iyd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, tzj] */
    @Override // defpackage.uem, defpackage.uel
    public final Object a() throws SecurityException, IllegalArgumentException {
        switch (this.b) {
            case 0:
                final iyf iyfVar = (iyf) this.a;
                return new fre() { // from class: iye
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        return swz.i(iyfVar.a, new hia(10), sxo.a);
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                };
            case 1:
                return ((hie) this.a).a();
            case 2:
                Object obj = this.a;
                paq paqVarX = gsn.X();
                try {
                    Set set = (Set) Collection.EL.stream(((tzz) obj).a()).map(new hci(9)).collect(ryv.b);
                    paqVarX.close();
                    return set;
                } catch (Throwable th) {
                    try {
                        paqVarX.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                return new iyi(this.a);
            case 4:
                return (scn) this.a.fr();
            case 5:
                ?? r3 = this.a;
                if (!((rwc) r3.a()).h()) {
                    return null;
                }
                return null;
            case 6:
                return false;
            default:
                return this.a;
        }
    }
}
