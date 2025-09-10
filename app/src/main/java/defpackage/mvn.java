package defpackage;

import android.widget.ImageView;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import com.google.android.apps.camera.ui.hotshot.jni.HotshotObjectDetector;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mvn implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mvn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r2v8, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, nkm] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z;
        ovp ovpVar;
        pdj pdjVar;
        boolean z2;
        boolean z3 = false;
        switch (this.b) {
            case 0:
                HotshotController hotshotController = (HotshotController) this.a;
                mwn mwnVar = hotshotController.h;
                rwc rwcVar = mwnVar.b;
                boolean zH = rwcVar.h();
                mwd mwdVar = hotshotController.E;
                if (zH && mwnVar.c) {
                    HotshotView hotshotView = (HotshotView) rwcVar.c();
                    hotshotView.c = mwdVar;
                    hotshotView.invalidate();
                    return;
                }
                return;
            case 1:
                LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) this.a;
                ImageView imageView = longPressElapsedTimeView.c;
                if (imageView != null) {
                    if (imageView.getVisibility() == 0) {
                        longPressElapsedTimeView.c.setVisibility(4);
                    } else {
                        longPressElapsedTimeView.c.setVisibility(0);
                    }
                    longPressElapsedTimeView.postDelayed(longPressElapsedTimeView.e, 500L);
                    return;
                }
                return;
            case 2:
                mwp mwpVar = (mwp) this.a;
                mwpVar.h = 3;
                if (mwpVar.e != null) {
                    if (mwpVar.g) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e) {
                            ((sgt) ((sgt) mwp.a.c().i(e)).M((char) 5120)).s("Delay stop error.");
                        }
                    }
                    HotshotObjectDetector hotshotObjectDetector = mwpVar.e;
                    if (HotshotObjectDetector.b) {
                        long j = hotshotObjectDetector.c;
                        if (j != 0) {
                            HotshotObjectDetector.releaseHandle(j);
                        }
                        hotshotObjectDetector.c = 0L;
                    } else {
                        ((sgt) HotshotObjectDetector.a.c().M(5151)).s("Library is not loaded. Ignore stop()");
                    }
                }
                paq paqVar = mwpVar.f;
                if (paqVar == null) {
                    return;
                }
                paqVar.close();
                mwpVar.f = null;
                return;
            case 3:
                ((ovx) ((qqq) this.a).b).a(true);
                return;
            case 4:
                nca ncaVar = (nca) this.a;
                ncaVar.a = 1;
                ncaVar.i();
                return;
            case 5:
                Object obj = this.a;
                ndn ndnVar = (ndn) obj;
                synchronized (ndnVar.b) {
                    z = ((ndn) obj).g;
                }
                ShutterButton shutterButton = ndnVar.a;
                if (shutterButton.b != z) {
                    shutterButton.l(z);
                    return;
                }
                return;
            case 6:
                this.a.a();
                return;
            case 7:
                this.a.a();
                return;
            case 8:
                Object obj2 = this.a;
                ((njs) obj2).e.c(new nhp(obj2, 5));
                return;
            case 9:
                Object obj3 = this.a;
                ((njs) obj3).e.c(new nhp(obj3, 6));
                return;
            case 10:
                ((ntf) this.a).k.d("/enter_auto_night_sight", null);
                return;
            case 11:
                ((ntf) this.a).k.d("/stop_countdown", null);
                return;
            case 12:
                ntf ntfVar = (ntf) this.a;
                gxi gxiVar = (gxi) ntfVar.w.dL();
                tpc tpcVarM = nra.a.m();
                float f = gxiVar.a;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                ((nra) tphVar).b = f;
                float f2 = gxiVar.b;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                ((nra) tphVar2).c = f2;
                float f3 = gxiVar.c;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                nss nssVar = ntfVar.k;
                ((nra) tpcVarM.b).d = f3;
                nssVar.d("/zoom_limit", ((nra) tpcVarM.l()).h());
                return;
            case 13:
                Object obj4 = this.a;
                synchronized (((ouk) obj4).d) {
                    if (!((ouk) obj4).f && ((ouk) obj4).b == 0) {
                        ((ouk) obj4).f = true;
                        z3 = true;
                    }
                }
                if (z3) {
                    ((ouk) this.a).a.close();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                paq paqVar2 = ((paq[]) this.a)[0];
                if (paqVar2 != null) {
                    paqVar2.close();
                    return;
                }
                return;
            case 15:
                Object obj5 = this.a;
                ovo ovoVar = (ovo) obj5;
                synchronized (ovoVar.a) {
                    ovpVar = (ovp) ((ovo) obj5).d.pollFirst();
                }
                if (ovpVar != null) {
                    try {
                        if (!ovpVar.b.isCancelled()) {
                            ovpVar.a.run();
                        }
                        synchronized (ovoVar.a) {
                            ((ovo) obj5).b--;
                        }
                        ovpVar.b.e(true);
                        return;
                    } catch (Throwable th) {
                        try {
                            ovpVar.b.a(th);
                            synchronized (ovoVar.a) {
                                ((ovo) obj5).b--;
                                ovpVar.b.e(true);
                                return;
                            }
                        } catch (Throwable th2) {
                            synchronized (ovoVar.a) {
                                ((ovo) obj5).b--;
                                ovpVar.b.e(true);
                                throw th2;
                            }
                        }
                    }
                }
                return;
            case 16:
                ((owu) this.a).a++;
                return;
            case 17:
                Object obj6 = this.a;
                owu owuVar = (owu) obj6;
                int i = owuVar.a - 1;
                owuVar.a = i;
                if (i != 0 || owuVar.e == null) {
                    return;
                }
                ((ovx) obj6).d(owuVar.e);
                owuVar.e = null;
                return;
            case 18:
                ((pew) this.a).a.dW();
                return;
            case 19:
                ((pew) this.a).a.n();
                return;
            default:
                Object obj7 = this.a;
                while (true) {
                    synchronized (obj7) {
                        pdjVar = ((pfa) obj7).c;
                        z2 = ((pfa) obj7).e;
                        ((pfa) obj7).d = false;
                        ((pfa) obj7).e = false;
                    }
                    if (z2) {
                        try {
                            pfq pfqVar = ((pfa) obj7).a;
                            synchronized (pfqVar) {
                                pdj pdjVarD = pfqVar.c.d(pdjVar, pfqVar.a);
                                if (!pdjVarD.equals(pfqVar.a)) {
                                    try {
                                        pgo pgoVarA = pfqVar.b.a();
                                        try {
                                            pgoVarA.m(pdjVarD);
                                            pgoVarA.close();
                                            synchronized (pfqVar) {
                                                phd phdVarA = phd.a(pdjVarD);
                                                phe pheVar = pfqVar.a;
                                                phdVarA.f = pheVar.a;
                                                phdVarA.g = pheVar.b;
                                                phdVarA.h = pheVar.c;
                                                pfqVar.c(phdVarA.c());
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                pgoVarA.close();
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                            break;
                                        }
                                    } catch (Throwable th5) {
                                        synchronized (pfqVar) {
                                            phd phdVarA2 = phd.a(pdjVarD);
                                            phe pheVar2 = pfqVar.a;
                                            phdVarA2.f = pheVar2.a;
                                            phdVarA2.g = pheVar2.b;
                                            phdVarA2.h = pheVar2.c;
                                            pfqVar.c(phdVarA2.c());
                                            throw th5;
                                        }
                                    }
                                }
                            }
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            ((pfa) obj7).b.c("Interrupted when updating 3a with locksRetained=" + z2, e2);
                        } catch (pco e3) {
                            ((pfa) obj7).b.c("FrameServer was closed when updating 3a with locksRetained=" + z2, e3);
                        }
                    } else {
                        pfq pfqVar2 = ((pfa) obj7).a;
                        synchronized (pfqVar2) {
                            pdj pdjVarD2 = pfqVar2.c.d(pdjVar, pfqVar2.a);
                            if (!pdjVarD2.equals(pfqVar2.a)) {
                                try {
                                    pgo pgoVarA2 = pfqVar2.b.a();
                                    try {
                                        pgoVarA2.f(pdjVarD2, true);
                                        pgoVarA2.close();
                                        synchronized (pfqVar2) {
                                            phd phdVarA3 = phd.a(pdjVarD2);
                                            phdVarA3.f = Boolean.valueOf(pfqVar2.e(pfqVar2.a, pdjVarD2));
                                            phdVarA3.g = Boolean.valueOf(pfqVar2.d(pfqVar2.a, pdjVarD2));
                                            phdVarA3.h = Boolean.valueOf(pfqVar2.f(pfqVar2.a, pdjVarD2));
                                            pfqVar2.c(phdVarA3.c());
                                        }
                                    } catch (Throwable th6) {
                                        try {
                                            pgoVarA2.close();
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                        }
                                        throw th6;
                                        break;
                                    }
                                } catch (Throwable th8) {
                                    synchronized (pfqVar2) {
                                        phd phdVarA4 = phd.a(pdjVarD2);
                                        phdVarA4.f = Boolean.valueOf(pfqVar2.e(pfqVar2.a, pdjVarD2));
                                        phdVarA4.g = Boolean.valueOf(pfqVar2.d(pfqVar2.a, pdjVarD2));
                                        phdVarA4.h = Boolean.valueOf(pfqVar2.f(pfqVar2.a, pdjVarD2));
                                        pfqVar2.c(phdVarA4.c());
                                        throw th8;
                                    }
                                }
                            }
                        }
                    }
                    synchronized (obj7) {
                        if (!((pfa) obj7).d) {
                            ((pfa) obj7).f = false;
                            return;
                        }
                    }
                }
        }
    }

    public mvn(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
