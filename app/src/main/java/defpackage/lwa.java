package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwa implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public lwa(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        scn scnVarG;
        final int i = 1;
        final int i2 = 0;
        switch (this.d) {
            case 0:
                return new lvz(((plt) this.a).b(), (Executor) this.b.a(), (ScheduledExecutorService) this.c.a());
            case 1:
                return new lsp((out) this.c.a(), (lrp) this.a.a(), tzs.b(this.b));
            case 2:
                return new lwb(((imn) this.b).a(), (out) this.c.a(), ((ixv) this.a).a());
            case 3:
                return new lwl((mdy) this.c.a(), new pql(), (cxb) this.a.a(), (luj) this.b.a());
            case 4:
                lww lwwVar = (lww) this.b.a();
                owf owfVar = (owf) this.c.a();
                juv juvVar = (juv) this.a.a();
                if (lwwVar.a) {
                    Optional optional = juvVar.g;
                    if (optional.isPresent()) {
                        return new sfm(qpt.cm((CaptureRequest.Key) optional.get(), owl.h(owfVar, new leb(13))));
                    }
                }
                return new sfm(new owi(qpt.cl()));
            case 5:
                return new frf(new gts(((hfg) this.a).a(), (pit) this.c.a(), ((kiu) this.b).a(), 11), "smarts", 0);
            case 6:
                boolean zBooleanValue = ((Boolean) this.a.a()).booleanValue();
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.c.a();
                rwc rwcVarB = ((lzr) this.b).b();
                if (zBooleanValue) {
                    scl sclVar = new scl();
                    sclVar.d(new gmh(ambientController, rwcVarB, 3));
                    scnVarG = sclVar.g();
                } else {
                    scnVarG = sfd.a;
                }
                scnVarG.getClass();
                return scnVarG;
            case 7:
                obu obuVar = (obu) this.a.a();
                return new mbc(obuVar, (luj) this.c.a());
            case 8:
                return true != ((hbj) this.a.a()).p(haq.e) ? ((mcp) this.c).a() : ((mcm) this.b).a();
            case 9:
                return new mca(((imm) this.a).b(), (hbj) this.b.a(), (pbn) this.c.a());
            case 10:
                final Instrumentation instrumentation = (Instrumentation) this.b.a();
                final pql pqlVar = (pql) this.a.a();
                final pbn pbnVar = (pbn) this.c.a();
                return new mes() { // from class: mee
                    @Override // defpackage.mes
                    public final Object a() {
                        int i3 = i2;
                        if (i3 == 0) {
                            mep mepVar = new mep(pqlVar, pbnVar);
                            instrumentation.f(mepVar);
                            return mepVar;
                        }
                        if (i3 != 1) {
                            OneCameraTiming oneCameraTiming = new OneCameraTiming(pqlVar, pbnVar);
                            instrumentation.f(oneCameraTiming);
                            return oneCameraTiming;
                        }
                        meu meuVar = new meu(pqlVar, pbnVar);
                        instrumentation.f(meuVar);
                        return meuVar;
                    }
                };
            case 11:
                final Instrumentation instrumentation2 = (Instrumentation) this.b.a();
                final pql pqlVar2 = (pql) this.a.a();
                final pbn pbnVar2 = (pbn) this.c.a();
                final int i3 = 2;
                return new mes() { // from class: mee
                    @Override // defpackage.mes
                    public final Object a() {
                        int i32 = i3;
                        if (i32 == 0) {
                            mep mepVar = new mep(pqlVar2, pbnVar2);
                            instrumentation2.f(mepVar);
                            return mepVar;
                        }
                        if (i32 != 1) {
                            OneCameraTiming oneCameraTiming = new OneCameraTiming(pqlVar2, pbnVar2);
                            instrumentation2.f(oneCameraTiming);
                            return oneCameraTiming;
                        }
                        meu meuVar = new meu(pqlVar2, pbnVar2);
                        instrumentation2.f(meuVar);
                        return meuVar;
                    }
                };
            case 12:
                final Instrumentation instrumentation3 = (Instrumentation) this.b.a();
                final pql pqlVar3 = (pql) this.a.a();
                final pbn pbnVar3 = (pbn) this.c.a();
                return new mes() { // from class: mee
                    @Override // defpackage.mes
                    public final Object a() {
                        int i32 = i;
                        if (i32 == 0) {
                            mep mepVar = new mep(pqlVar3, pbnVar3);
                            instrumentation3.f(mepVar);
                            return mepVar;
                        }
                        if (i32 != 1) {
                            OneCameraTiming oneCameraTiming = new OneCameraTiming(pqlVar3, pbnVar3);
                            instrumentation3.f(oneCameraTiming);
                            return oneCameraTiming;
                        }
                        meu meuVar = new meu(pqlVar3, pbnVar3);
                        instrumentation3.f(meuVar);
                        return meuVar;
                    }
                };
            case 13:
                ((imm) this.a).b();
                return new ocq((byte[]) null, (char[]) null);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar = this.c;
                mgr mgrVarA = ((mgs) this.b).a();
                ins.g((out) tzxVar.a(), ((iyb) this.a).a(), mgrVarA);
                return mgrVarA;
            case 15:
                return new mhu((Executor) this.a.a(), (owq) this.b.a(), ((mia) this.c).b());
            case 16:
                return new mln((mls) this.b.a(), ((lzr) this.c).b(), (pbn) this.a.a());
            case 17:
                return new gox(((imm) this.a).b(), (pbn) this.c.a(), (hbj) this.b.a());
            case 18:
                return new hwt((plc) this.b.a(), (qqq) this.a.a(), (hwv) this.c.a(), 1, 1, 1);
            case 19:
                hgm hgmVar = (hgm) this.a.a();
                Executor executor = (Executor) this.b.a();
                pbn pbnVar4 = (pbn) this.c.a();
                return new hws(hgmVar, new pbs(executor, pbnVar4, "trk-aeis"), pbnVar4);
            default:
                mmb mmbVar = ((hbj) this.c.a()).p(has.i) ? (mmb) this.b.a() : (mmb) this.a.a();
                mmbVar.getClass();
                return mmbVar;
        }
    }

    public lwa(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public lwa(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public lwa(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public lwa(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }
}
