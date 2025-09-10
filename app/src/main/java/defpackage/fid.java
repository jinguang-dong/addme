package defpackage;

import j$.util.Optional;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fid implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fid(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lst] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, may] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, lpc] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, pnh] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                ((fif) this.a).l.removeOnLayoutChangeListener(this.b);
                return;
            case 1:
                ((lsp) this.a).i(this.b);
                return;
            case 2:
                ((our) this.a).close();
                Object obj = this.b;
                fja fjaVar = (fja) obj;
                fjaVar.f.a(false);
                fjaVar.c.execute(new fem(obj, 13));
                return;
            case 3:
                fje fjeVar = (fje) this.b;
                fjeVar.h.b();
                fjz fjzVar = fjeVar.e;
                fjzVar.k();
                fjzVar.f();
                fjzVar.g();
                fjzVar.n.a(false);
                fvu fvuVar = fjeVar.c;
                fvuVar.B((gsn) this.a);
                fvuVar.p(true);
                fjeVar.c(fjl.BY_USER);
                fjeVar.b.b();
                paq paqVar = fjeVar.j;
                if (paqVar != null) {
                    paqVar.close();
                    return;
                }
                return;
            case 4:
                ((hbp) this.b).d((foy) this.a);
                return;
            case 5:
                rwc rwcVar = ((fty) this.b).c;
                if (rwcVar.h()) {
                    ((mac) rwcVar.c()).g(this.a);
                    return;
                }
                return;
            case 6:
                Object obj2 = this.a;
                ?? r1 = ((pfl) this.b).a;
                synchronized (r1) {
                    r1.remove(obj2);
                }
                return;
            case 7:
                ((fzh) this.b).b.remove(this.a);
                return;
            case 8:
                ((gal) this.b).a.remove(this.a);
                return;
            case 9:
                ((gcp) this.b).d.b(this.a);
                return;
            case 10:
                ((gcp) this.a).a((gau) this.b);
                return;
            case 11:
                ((ghr) this.a).a.remove(this.b);
                return;
            case 12:
                Object obj3 = this.b;
                Object obj4 = this.a;
                synchronized (obj4) {
                    ((gks) obj4).a.remove(obj3);
                }
                return;
            case 13:
                Object obj5 = this.b;
                ((gqx) obj5).f.a(Optional.empty());
                this.a.close();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i = gwv.Y;
                ((qwz) this.a).d.remove(this.b);
                return;
            case 15:
                Set set = ((hrm) this.b).b;
                Object obj6 = this.a;
                synchronized (set) {
                    set.remove(obj6);
                    set.size();
                }
                return;
            case 16:
                ((hsb) this.a).c((hrm) this.b);
                return;
            case 17:
                this.a.close();
                ((hti) this.b).A = null;
                return;
            case 18:
                hto htoVar = (hto) this.a;
                htoVar.i.i(this.b);
                our ourVar = htoVar.g;
                if (ourVar != null) {
                    ourVar.close();
                    return;
                }
                return;
            case 19:
                Object obj7 = this.a;
                htv htvVar = (htv) this.b;
                if (a.ao(htvVar.e, obj7)) {
                    htvVar.e = null;
                    return;
                }
                return;
            default:
                Object obj8 = this.a;
                htv htvVar2 = (htv) this.b;
                if (a.ao(htvVar2.n, obj8)) {
                    htvVar2.n = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fid(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
