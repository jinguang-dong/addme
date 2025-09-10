package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.ui.accessibility.AccessibilityAnnouncer;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkk implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        int i = 0;
        switch (this.d) {
            case 0:
                return new hwt((plc) this.a.a(), (qqq) this.c.a(), (hwv) this.b.a(), 12, 1, 1);
            case 1:
                gaw gawVarB = ((ggc) this.c).b();
                gau gauVarA = ((gfy) this.a).a();
                jwl jwlVar = (jwl) this.b.a();
                jwlVar.getClass();
                CaptureRequest.Key key = jwlVar.a;
                return key == null ? qpt.cl() : (gawVarB.U && gauVarA.j.dL() == gho.ACTIVE) ? qpt.ch(new pej(key, 3)) : qpt.cl();
            case 2:
                ((gzf) this.a).a();
                ((hbi) this.c).a();
                return new ezh((byte[]) null);
            case 3:
                owq owqVar = (owq) this.a.a();
                owf owfVar = (owf) this.c.a();
                our ourVar = (our) this.b.a();
                owqVar.getClass();
                owfVar.getClass();
                ourVar.getClass();
                return new frf(new gdq((Object) ourVar, (Object) owfVar, (Object) owqVar, 4, (byte[]) null), mNLbzhCxd.YfnHKur, 0);
            case 4:
                return new ijj((ilf) this.a.a(), (ile) this.c.a(), new pql(), (pnq) this.b.a());
            case 5:
                return new ijx((ijr) this.a.a(), (ija) this.c.a(), (luj) this.b.a());
            case 6:
                ((imn) this.c).a();
                Context contextB = ((imm) this.a).b();
                new Timer();
                return new AccessibilityAnnouncer(contextB);
            case 7:
                return new mgh(((jdg) this.a).b(), (luj) this.b.a(), rvk.a, (fdq) this.c.a());
            case 8:
                return new kct(((kcz) this.b).a(), (Map) this.a.a(), (fuf) this.c.a());
            case 9:
                return new hwt((plc) this.a.a(), (qqq) this.c.a(), (hwv) this.b.a(), 12, 1, 1);
            case 10:
                plc plcVar = (plc) this.a.a();
                hwv hwvVar = (hwv) this.b.a();
                qqq qqqVar = (qqq) this.c.a();
                int i2 = kok.a;
                return new hwt(plcVar, qqqVar, hwvVar, 12, 1, 1);
            case 11:
                Object objA = ((kiu) this.c).a().l() == pka.FRONT ? (kvy) this.a.a() : ((kwi) this.b).a();
                objA.getClass();
                return objA;
            case 12:
                pdu pduVar = (pdu) this.a.a();
                pdt pdtVar = (pdt) this.c.a();
                Set set = (Set) this.b.a();
                pduVar.getClass();
                pdtVar.getClass();
                set.getClass();
                pfu pfuVarA = pduVar.a(pdtVar);
                pfuVarA.n(set);
                pfuVarA.getClass();
                return pfuVarA;
            case 13:
                return new hwt((plc) this.a.a(), (qqq) this.c.a(), (hwv) this.b.a(), 1, 2, 2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object sfmVar2 = (((hbj) this.b.a()).p(gze.e) && ((kiu) this.c).a().l() == pka.BACK) ? new sfm((fby) this.a.a()) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 15:
                tzx tzxVar = this.b;
                pjo pjoVarA = ((kiv) this.c).a();
                boolean zBooleanValue = ((koh) tzxVar).b().booleanValue();
                if (hak.b((hbj) this.a.a()) || zBooleanValue) {
                    sfmVar = sfd.a;
                } else {
                    Iterator it = pjoVarA.B().iterator();
                    while (it.hasNext()) {
                        String name = ((CaptureRequest.Key) it.next()).getName();
                        CaptureRequest.Key key2 = kgx.b;
                        if (name.equals(key2.getName())) {
                            sfmVar = new sfm(qpt.ci(key2, 1));
                        }
                    }
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 16:
                pfu pfuVar = (pfu) this.c.a();
                tzx tzxVar2 = this.a;
                peo peoVarB = ((lbe) this.b).b();
                Set setA = ((tzz) tzxVar2).a();
                pfuVar.getClass();
                setA.getClass();
                return pfuVar.f(peoVarB, setA);
            case 17:
                long jLongValue = ((lbn) this.c).a().longValue();
                int iIntValue = ((Integer) this.a.a()).intValue();
                gaw gawVarB2 = ((ggc) this.b).b();
                if (!gawVarB2.P) {
                    return Optional.empty();
                }
                pjr pjrVar = gawVarB2.b;
                pep pepVarA = peq.a();
                pepVarA.b(pjrVar);
                pepVarA.r(pet.IMAGE_READER);
                pepVarA.i(iIntValue);
                pepVarA.c(5);
                pepVarA.n((pas) gawVarB2.Q.c());
                pepVarA.f(true);
                pepVarA.e(jLongValue);
                pepVarA.s(3L);
                return Optional.of(pepVarA.a());
            case 18:
                pfu pfuVar2 = (pfu) this.c.a();
                rwc rwcVar = (rwc) this.b.a();
                if (((Boolean) this.a.a()).booleanValue()) {
                    return rvk.a;
                }
                a.I(rwcVar.h());
                return rwc.j(pfuVar2.e(new sfm((peo) rwcVar.c())));
            case 19:
                rwc rwcVar2 = (rwc) this.b.a();
                hbj hbjVar = (hbj) this.c.a();
                boolean zBooleanValue2 = ((Boolean) this.a.a()).booleanValue();
                if (!hbjVar.p(hac.A) || !hbjVar.p(hac.q) || zBooleanValue2) {
                    return rvk.a;
                }
                a.I(rwcVar2.h());
                return rwc.j((peo) rwcVar2.c());
            default:
                hbj hbjVar2 = (hbj) this.c.a();
                kuj kujVar = (kuj) this.b.a();
                owq owqVarA = ((gfx) this.a).a();
                hbjVar2.getClass();
                kujVar.getClass();
                return new frf(new lbk(kujVar, hbjVar2, owqVarA, i), "pck-vfl", 0);
        }
    }

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[] iArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public gkk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[][][] fArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
