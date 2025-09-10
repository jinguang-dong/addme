package defpackage;

import com.google.android.apps.camera.ui.hotshot.HotshotController;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktu implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ktu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lpc] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, lpc] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, npx] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v32, types: [glr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, pdm] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        ito itoVar;
        int i = 17;
        switch (this.c) {
            case 0:
                ((ktv) this.a).a.c(this.b);
                return;
            case 1:
                ?? r0 = this.b;
                ?? r5 = this.a;
                synchronized (((kpi) r5).a) {
                    r0.m(r5);
                    ((kpi) r5).b = false;
                }
                return;
            case 2:
                ((lpd) this.b).b(this.a);
                return;
            case 3:
                ((kzo) this.b).b.remove(this.a);
                return;
            case 4:
                ((pfl) this.b).a.remove(this.a);
                return;
            case 5:
                ((lpm) this.a).a.remove(this.b);
                return;
            case 6:
                ((mwq) this.b).a.remove(this.a);
                return;
            case 7:
                Object obj = this.b;
                synchronized (obj) {
                    ((pit) obj).a.remove(this.a);
                }
                return;
            case 8:
                ((frk) this.a).close();
                ((lyu) this.b).k = lyu.b;
                return;
            case 9:
                Object obj2 = this.b;
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((mhn) obj3).a.remove(obj2);
                }
                return;
            case 10:
                Object obj4 = this.a;
                synchronized (obj4) {
                    rwc rwcVar = ((mln) obj4).e;
                }
                mln mlnVar = (mln) obj4;
                mlnVar.a.execute(mlnVar.b.c("detachResources.close", new mjh(this.b, i)));
                return;
            case 11:
                ((mls) this.a).j((rwc) this.b);
                return;
            case 12:
                mod modVar = (mod) this.b;
                modVar.b.remove(this.a);
                modVar.m();
                return;
            case 13:
                ((mte) this.b).n.d(this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj5 = this.a;
                if (obj5 == null || (itoVar = ((HotshotController) this.b).u) == null) {
                    return;
                }
                ((itl) obj5).h(itoVar);
                return;
            case 15:
                Object obj6 = this.a;
                Object obj7 = ((ndn) obj6).b;
                Object obj8 = this.b;
                synchronized (obj7) {
                    ((ndn) obj6).c.remove(obj8);
                    if (!((ndn) obj6).aI()) {
                        ((ndn) obj6).aH(false, false, true, new ndk(2));
                        ((ndn) obj6).aG(false, false);
                    }
                }
                return;
            case 16:
                ((lpd) this.b).b(this.a);
                return;
            case 17:
                ((npt) this.a).b(this.b);
                return;
            case 18:
                ((ovx) this.b).b.remove(this.a);
                return;
            case 19:
                if (((AtomicBoolean) this.b).getAndSet(true)) {
                    return;
                }
                Object obj9 = this.a;
                ((owu) obj9).c.execute(new mvn(obj9, i));
                return;
            default:
                Object obj10 = this.b;
                Object obj11 = this.a;
                synchronized (obj11) {
                    ((pck) obj11).a.remove(obj10);
                }
                return;
        }
    }

    public /* synthetic */ ktu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public ktu(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
