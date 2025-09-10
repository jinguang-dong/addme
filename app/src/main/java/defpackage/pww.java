package defpackage;

import android.os.SystemClock;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pww implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public pww(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return (puu) ((rwg) ((jaf) this.a).b()).a;
            case 1:
                return new qaq(((imm) this.a).b(), (short[]) null);
            case 2:
                return new qaq(((imm) this.a).b(), (byte[]) null);
            case 3:
                return new qdf(((imm) this.a).b());
            case 4:
                rww rwwVarY = rnt.y(new nxi(((tzv) this.a).a(), 4));
                rwwVarY.getClass();
                return rwwVarY;
            case 5:
                qsb qsbVar = (qsb) qpt.A((rwc) ((tzu) this.a).a, new qmv(2));
                qsbVar.getClass();
                return qsbVar;
            case 6:
                qra qraVar = (qra) qpt.A((rwc) ((tzu) this.a).a, new qmv(1));
                qraVar.getClass();
                return qraVar;
            case 7:
                qrf qrfVar = (qrf) qpt.A(((jaf) this.a).b(), new qmv(9));
                qrfVar.getClass();
                return qrfVar;
            case 8:
                qsi qsiVar = (qsi) qpt.A((rwc) ((tzu) this.a).a, new qmv(0));
                qsiVar.getClass();
                return qsiVar;
            case 9:
                rwc rwcVar = (rwc) ((tzu) this.a).a;
                return rwcVar.h() ? rwc.i((qqh) ((uem) rwcVar.c()).a()) : rvk.a;
            case 10:
                qsx qsxVar = (qsx) qpt.A((rwc) ((tzu) this.a).a, new qmv(3));
                qsxVar.getClass();
                return qsxVar;
            case 11:
                qur qurVar = (qur) qpt.A(((jaf) this.a).b(), new qmv(4));
                qurVar.getClass();
                return qurVar;
            case 12:
                return (qnk) ((jaf) this.a).b().e(qnk.a().b());
            case 13:
                qvb qvbVar = (qvb) qpt.A((rwc) ((tzu) this.a).a, new pmt(2));
                qvbVar.getClass();
                return qvbVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                quw quwVar = (quw) qpt.A(((jaf) this.a).b(), new qmv(6));
                quwVar.getClass();
                return quwVar;
            case 15:
                qvd qvdVar = (qvd) qpt.A((rwc) ((tzu) this.a).a, new qmv(8));
                qvdVar.getClass();
                return qvdVar;
            case 16:
                return new qqn(((imm) this.a).b());
            case 17:
                return new Random(SystemClock.elapsedRealtime());
            case 18:
                qnc qncVar = (qnc) this.a.a();
                qnc.a(qncVar);
                qncVar.getClass();
                return qncVar;
            case 19:
                return (qpt) ((jaf) this.a).b().e(new qpt((byte[]) null));
            default:
                return new qng();
        }
    }
}
