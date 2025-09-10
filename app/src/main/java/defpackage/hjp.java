package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hjp implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hjp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, tzj] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Runnable runnableF = null;
        switch (this.b) {
            case 0:
                ((hjr) this.a).a().run();
                return;
            case 1:
                hiq hiqVar = (hiq) this.a;
                ((hig) hiqVar.b.a()).e(true);
                if (((hhv) hiqVar.e.dL()).equals(hhv.SINGLE) || !((Boolean) ((ovx) hiqVar.k).d).booleanValue()) {
                    return;
                }
                rnt.L(true);
                ((lae) ((rwg) hiqVar.j).a).f();
                return;
            case 2:
                this.a.a();
                return;
            case 3:
                hks hksVar = (hks) this.a;
                hksVar.h = false;
                hksVar.j.start();
                return;
            case 4:
                Object obj = this.a;
                synchronized (((hmj) obj).b) {
                    if (((hmj) obj).c == null) {
                        ((hmj) obj).c = ((hmj) obj).a.b("FeatureCentral");
                    }
                }
                return;
            case 5:
                Object obj2 = this.a;
                synchronized (((hmj) obj2).b) {
                    plb plbVar = ((hmj) obj2).c;
                    if (plbVar != null) {
                        plbVar.close();
                        ((hmj) obj2).c = null;
                    }
                }
                return;
            case 6:
                ((gox) this.a.a()).l();
                return;
            case 7:
                ((fto) this.a).a();
                return;
            case 8:
                this.a.a();
                return;
            case 9:
                ((ovx) this.a).a(true);
                return;
            case 10:
                ((ovx) this.a).a(false);
                return;
            case 11:
                this.a.a(true);
                return;
            case 12:
                this.a.a(false);
                return;
            case 13:
                this.a.a(0);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.a(1);
                return;
            case 15:
                Object obj3 = this.a;
                synchronized (imi.a) {
                    imj imjVar = ((imi) obj3).q;
                    if (imjVar != null) {
                        runnableF = imjVar.f();
                        ((imi) obj3).f(((imi) obj3).q);
                    }
                }
                if (runnableF != null) {
                    runnableF.run();
                    return;
                }
                return;
            case 16:
                this.a.a();
                return;
            case 17:
                ((nqp) ((iyu) this.a).E.a()).x();
                return;
            case 18:
                ((hna) this.a).f();
                return;
            case 19:
                ((hna) this.a).b.a();
                return;
            default:
                ((nqp) ((iyu) this.a).E.a()).q();
                return;
        }
    }
}
