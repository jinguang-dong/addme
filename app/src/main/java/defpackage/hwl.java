package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.apps.camera.hdrplus.fusion.focusstack.jni.NativeFusionFocusStack;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.ShotMetadata;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwl implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public hwl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v73, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        String str;
        switch (this.a) {
            case 0:
                inz inzVar = (inz) this.b.a();
                inzVar.getClass();
                return new sfm(new hwk(inzVar, 0));
            case 1:
                inz inzVar2 = (inz) this.b.a();
                inzVar2.getClass();
                return new jqj(inzVar2, 1);
            case 2:
                return new cxb((hyd) this.b.a());
            case 3:
                return new hxy((hbj) this.b.a());
            case 4:
                our ourVar = (our) this.b.a();
                HandlerThread handlerThread = new HandlerThread("lastPslFrame");
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                Looper looper = handler.getLooper();
                looper.getClass();
                ourVar.d(new ffy(looper, 20));
                return handler;
            case 5:
                cxb cxbVar = (cxb) ins.a(this.b);
                cxbVar.getClass();
                return cxbVar;
            case 6:
                Gcam gcam = (Gcam) ins.a(this.b);
                gcam.getClass();
                return gcam;
            case 7:
                return new hzp((Gcam) this.b.a(), 0);
            case 8:
                return new iso((lrp) this.b.a());
            case 9:
                return new icu((jva) this.b.a());
            case 10:
                return (ida) ((rwg) ((jaf) this.b).b()).a;
            case 11:
                hbj hbjVar = (hbj) this.b.a();
                lpn lpnVar = new lpn();
                lpnVar.e = 1;
                lpnVar.a(Integer.MAX_VALUE);
                lpnVar.c = 1000L;
                lpnVar.d = (byte) (lpnVar.d | 2);
                lpnVar.a = "Falcon";
                lpnVar.a(((Integer) hbjVar.a(gzc.g).get()).intValue());
                if (lpnVar.a == null) {
                    throw new IllegalStateException();
                }
                a.I(!r5.isEmpty());
                if (lpnVar.d != 3 || (str = lpnVar.a) == null || lpnVar.e == 0) {
                    throw new IllegalStateException();
                }
                return new lpj(str, lpnVar.b, lpnVar.c);
            case 12:
                lgp lgpVar = (lgp) ins.a(this.b);
                lgpVar.getClass();
                return lgpVar;
            case 13:
                owf owfVarA = owb.a((ovx) this.b.a());
                owfVarA.getClass();
                return owfVarA;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Set set = ((kit) ((ieu) this.b).a().dL()).a;
                set.getClass();
                return set;
            case 15:
                owf owfVarA2 = owb.a((ovx) this.b.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 16:
                syw sywVarA = ske.A((ExecutorService) this.b.a());
                sywVarA.getClass();
                return sywVarA;
            case 17:
                return !((hbj) this.b.a()).p(gzc.k) ? new ifz() : new NativeFusionFocusStack();
            case 18:
                final Set setA = ((tzz) this.b).a();
                return new ihc() { // from class: ihd
                    @Override // defpackage.ihc
                    public final void a(ShotMetadata shotMetadata, lss lssVar, hxu hxuVar, iea ieaVar) {
                        Iterator it = setA.iterator();
                        while (it.hasNext()) {
                            ((ihc) it.next()).a(shotMetadata, lssVar, hxuVar, ieaVar);
                        }
                    }
                };
            case 19:
                szh szhVar = (szh) this.b.a();
                ovx ovxVar = new ovx(new owi(false));
                ske.W(szhVar, new owj(ovxVar), sxo.a);
                owf owfVarA3 = ovz.a(ovxVar);
                owfVarA3.getClass();
                return owfVarA3;
            default:
                return ((cxb) this.b).a;
        }
    }
}
