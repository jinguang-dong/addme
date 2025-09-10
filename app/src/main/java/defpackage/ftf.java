package defpackage;

import android.content.Context;
import com.google.android.apps.camera.autotimer.analysis.jni.Curator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftf implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public ftf(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        plb plbVarB;
        switch (this.c) {
            case 0:
                return new rnn((pbn) this.a.a(), (ScheduledExecutorService) this.b.a());
            case 1:
                return new pbs(((ftg) this.b).a(), (pbn) this.a.a(), "IOTask");
            case 2:
                return ((rnn) this.a.a()).b(((fry) this.b).b());
            case 3:
                return new fsv((Executor) this.b.a(), (ScheduledExecutorService) this.a.a());
            case 4:
                return new ftb(((imm) this.b).b(), (gno) this.a.a(), 0, null);
            case 5:
                return ((fuf) this.a.a()).a ? ((jaf) this.b).b() : rvk.a;
            case 6:
                return ((fuf) this.a.a()).a(nkw.PHOTO) ? ((jaf) this.b).b() : rvk.a;
            case 7:
                return ((fuf) this.a.a()).a(nkw.PORTRAIT) ? ((jaf) this.b).b() : rvk.a;
            case 8:
                return !((Boolean) ((owq) this.a.a()).dL()).booleanValue() ? new ovx(mtp.OFF) : ((owq) this.b.a()).dL() == fug.AUTO ? new ovx(mtp.AUTO) : new ovx(mtp.MAX);
            case 9:
                return new fuf((owf) this.b.a(), (hbj) this.a.a());
            case 10:
                rwc rwcVar = (rwc) this.a.a();
                our ourVar = (our) this.b.a();
                if (!rwcVar.h() || (plbVarB = ((plc) rwcVar.c()).b("AutoTimerSession")) == null) {
                    return rvk.a;
                }
                ourVar.d(plbVarB);
                return rwc.j(plbVarB);
            case 11:
                hbj hbjVar = (hbj) this.b.a();
                Context contextB = ((imm) this.a).b();
                int i = true != hbjVar.p(gyj.b) ? 2 : 5;
                tpc tpcVarM = tuz.a.m();
                String absolutePath = contextB.getCacheDir().getAbsolutePath();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                tuz tuzVar = (tuz) tphVar;
                absolutePath.getClass();
                tuzVar.b |= 16777216;
                tuzVar.o = absolutePath;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                tuz tuzVar2 = (tuz) tphVar2;
                tuzVar2.b = 2 | tuzVar2.b;
                tuzVar2.e = false;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tuz tuzVar3 = (tuz) tpcVarM.b;
                tuzVar3.d = i - 1;
                tuzVar3.b |= 1;
                Curator curator = new Curator((tuz) tpcVarM.l());
                curator.nativeSetCaptureEnabled(true);
                return curator;
            case 12:
                return new iso((mdy) this.a.a(), (fut) this.b.a(), (char[]) null);
            case 13:
                return new fwe(this.a.a(), (uem) this.b, 0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hhc hhcVar = (hhc) this.b.a();
                return new fwp(hhcVar);
            case 15:
                fzf fzfVar = (fzf) this.b.a();
                return new cxb(fzfVar);
            case 16:
                Object gblVar = ((hbj) this.b.a()).p(gym.an) ? (gbg) this.a.a() : new gbl();
                gblVar.getClass();
                return gblVar;
            case 17:
                Object sfmVar = ((hbj) this.a.a()).p(gym.at) ? new sfm(((gcx) this.b).a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 18:
                return new gda((plc) this.b.a(), (cxb) this.a.a());
            case 19:
                return new lta((plc) this.a.a(), (cxb) this.b.a());
            default:
                return new gfu(((ixz) this.a).a(), (hbj) this.b.a());
        }
    }

    public ftf(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
