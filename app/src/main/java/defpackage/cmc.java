package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cmc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cmc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, lzm] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r7v33, types: [gqa, java.lang.Object, lyt] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, mxl] */
    @Override // java.lang.Runnable
    public final void run() {
        szh szhVar;
        int i = 7;
        byte[] bArr = null;
        int i2 = 2;
        switch (this.c) {
            case 0:
                ((cmd) this.a).a((Typeface) this.b);
                return;
            case 1:
                ((nh) this.b).k((nu) this.a);
                return;
            case 2:
                fdt fdtVar = (fdt) this.b;
                cxb cxbVar = fdtVar.e;
                Object obj = this.a;
                if (!cxbVar.v()) {
                    hfv hfvVar = (hfv) obj;
                    if (hfvVar.a) {
                        return;
                    }
                    fdtVar.b.c(new hgx("Unable to enumerate any cameras", fdt.d(hfvVar), pka.BACK, pka.FRONT));
                    return;
                }
                hfv hfvVar2 = (hfv) obj;
                if (hfvVar2.a) {
                    ((gox) fdtVar.d.g).j(gpf.ENUMERATION);
                    return;
                }
                if (!pbw.d(fdt.d(hfvVar2))) {
                    fdtVar.b.c(new hgx("Unable to enumerate any cameras", fdt.d(hfvVar2), pka.BACK, pka.FRONT));
                    return;
                }
                qrh qrhVar = fdtVar.d;
                Object obj2 = qrhVar.g;
                gpf gpfVar = gpf.ENUMERATION;
                gox goxVar = (gox) obj2;
                goxVar.i(gpfVar);
                ske.W(goxVar.d(gpfVar), new fxw(qrhVar, 3), qrhVar.c);
                return;
            case 3:
                fgw fgwVar = (fgw) this.a;
                if (fgwVar.o() && ((fgn) this.b).b()) {
                    fgwVar.b(true);
                    return;
                }
                return;
            case 4:
                ((jgt) this.b).k((fnc) this.a.a());
                return;
            case 5:
                ((MainActivityLayout) ((ngw) this.a).c).h(this.b);
                return;
            case 6:
                ((jgt) this.a).k(this.b);
                return;
            case 7:
                ((jgt) this.a).k(this.b);
                return;
            case 8:
                dei.a((dco) ((gop) this.b).b.x().a, false, true, new arc(((pjr) this.a).a, 11));
                return;
            case 9:
                Iterable$EL.forEach(Arrays.asList((Object[]) this.a), new gok(this.b, i2));
                return;
            case 10:
                ((gqx) this.b).a(sbp.l(((Optional) this.a).get()));
                return;
            case 11:
                ((gso) this.b).h.c(this.a);
                return;
            case 12:
                ?? r0 = this.a;
                ?? r7 = this.b;
                gso gsoVar = (gso) r7;
                gsoVar.b = r0;
                lyu lyuVar = gsoVar.e;
                lyuVar.k = r7;
                frk frkVar = new frk();
                frkVar.add(lyuVar.l.j(lyuVar));
                frkVar.add(lyuVar.d.dK(new leg(lyuVar, r7, i, bArr), lyuVar.c));
                ktu ktuVar = new ktu(lyuVar, frkVar, 8, bArr);
                our ourVar = gsoVar.a;
                ourVar.d(ktuVar);
                gqc gqcVar = gsoVar.h;
                gqcVar.f = r7;
                gri griVar = gqcVar.d;
                griVar.e = gqcVar;
                gqk gqkVar = griVar.c;
                gqkVar.c = griVar;
                ourVar.d(new ffx(gqcVar, new ffx(griVar, new ffy(gqkVar, 9), 5), 4));
                ourVar.d(gsoVar.f.i(gsoVar));
                return;
            case 13:
                ((gtb) this.a).a = (gsz) this.b;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                try {
                    hfv hfvVar3 = (hfv) this.a.get();
                    Object obj3 = this.b;
                    if (hfvVar3.a) {
                        try {
                            List listB = ((hfr) obj3).a.b();
                            if (listB.isEmpty()) {
                                hfvVar3 = new hfv(true);
                            } else {
                                List list = (List) Collection.EL.stream(listB).map(new gbm(i)).filter(new fla(19)).collect(Collectors.toList());
                                if (list.isEmpty()) {
                                    hfvVar3 = new hfv(true);
                                } else {
                                    hfv hfvVar4 = new hfv(false);
                                    hfvVar4.b = (pbw) list.get(0);
                                    hfvVar3 = hfvVar4;
                                }
                            }
                        } catch (pjt | pjv | pjw e) {
                            pbw pbwVarA = pbw.CAMERA_ERROR_CODE_UNKNOWN;
                            if (e instanceof pjw) {
                                pbwVarA = pbw.CAMERAS_NOT_ENUMERATED;
                            }
                            if (e instanceof pjt) {
                                List list2 = ((pjt) e).a;
                                if (list2 != null && Collection.EL.stream(list2).anyMatch(new fla(18))) {
                                    pbwVarA = pbw.CAMERAS_NOT_ENUMERATED;
                                }
                            } else if (e instanceof pjv) {
                                pbwVarA = pbw.a(((pjv) e).a);
                            }
                            hfv hfvVar5 = new hfv(false);
                            hfvVar5.b = pbwVarA;
                            hfvVar5.c = e;
                            hfvVar3 = hfvVar5;
                        }
                    }
                    synchronized (((hfr) obj3).b) {
                        szhVar = ((hfr) obj3).c;
                        ((hfr) obj3).c = null;
                    }
                    szhVar.getClass();
                    szhVar.e(hfvVar3);
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    throw new rxd(e2);
                }
            case 15:
                ((MainActivityLayout) ((ngx) this.a).a().c).h(this.b);
                return;
            case 16:
                ?? r02 = this.b;
                r02.f("MICRO_ImageReaderModule_runningStartupTasks");
                for (Runnable runnable : ((tzz) this.a).a()) {
                    r02.f("MICRO_ImageReaderModule_runSingleTask");
                    runnable.run();
                    r02.g();
                }
                r02.g();
                return;
            case 17:
                ((hpb) this.a.getKey()).ey((lnl) this.b);
                return;
            case 18:
                ((how) this.a.getKey()).a((hpd) this.b);
                return;
            case 19:
                hqu hquVar = (hqu) this.a;
                SQLiteDatabase readableDatabase = hquVar.getReadableDatabase();
                hqs hqsVar = (hqs) this.b;
                hqsVar.b.e(readableDatabase);
                hqsVar.c.e(hquVar.getWritableDatabase());
                return;
            default:
                ((nas) this.a).b();
                ((ihn) this.b).a(true);
                return;
        }
    }

    public /* synthetic */ cmc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
