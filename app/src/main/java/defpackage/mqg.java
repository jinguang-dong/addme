package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Trace;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqg implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                return new mqf((mpf) this.a.a(), (moy) this.b.a(), (gjj) this.c.a());
            case 1:
                return new mmc((hwt) this.b.a(), (hpj) this.c.a(), (hpa) this.a.a());
            case 2:
                return new mrr((owq) this.b.a(), (gjj) this.a.a(), (gjn) this.c.a());
            case 3:
                return new qqq((hbj) this.a.a(), ((imm) this.b).b());
            case 4:
                return new naw(((imm) this.b).b(), (imi) this.a.a(), (hgc) this.c.a());
            case 5:
                return new hrg((out) this.c.a(), ((ixv) this.b).a(), (ngb) this.a.a(), 6, null);
            case 6:
                return !((hbj) this.a.a()).p(gzo.as) ? ((nfy) this.c).a() : ((nfr) this.b).a();
            case 7:
                return new njr((muu) this.c.a(), this.b, (hbj) this.a.a(), 1);
            case 8:
                return new njr((rwc) this.c.a(), this.b, ((imm) this.a).b(), 0);
            case 9:
                return new njr((rwc) this.c.a(), this.b, ((imm) this.a).b(), 2);
            case 10:
                return new njr((gli) this.c.a(), (uem) this.b, (hbj) this.a.a(), 3);
            case 11:
                return new owd((hbj) this.b.a(), (luj) this.a.a(), (luj) this.c.a());
            case 12:
                return new nms(((pab) this.a).a(), (pjo) this.b.a(), (hbj) this.c.a());
            case 13:
                hbj hbjVar = (hbj) this.b.a();
                tzx tzxVar = this.c;
                pkr pkrVarA = ((pks) this.a).a();
                return hbjVar.p(gzo.ak) ? new npv(pkrVarA, (npt) tzxVar.a()) : pkrVarA;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar2 = this.a;
                tzx tzxVar3 = this.b;
                tzj tzjVarB = tzs.b(this.c);
                jgt jgtVarA = ((iyb) tzxVar3).a();
                out outVar = (out) tzxVar2.a();
                ntf ntfVar = (ntf) tzjVarB.a();
                ins.g(outVar, jgtVarA, ntfVar);
                ntfVar.getClass();
                return ntfVar;
            case 15:
                tzx tzxVar4 = this.b;
                Object obj = ((tzu) this.a).a;
                Context contextB = ((imm) tzxVar4).b();
                ps psVarA = ((pac) this.c).a();
                Set set = (Set) obj;
                HashMap map = new HashMap(set.size());
                ske.bh(map, set);
                if (map.size() != set.size()) {
                    Objects.toString(set);
                    throw new IllegalStateException("Unexpected or mismatched cameraBackends! Received: ".concat(set.toString()));
                }
                pr prVar = new pr(contextB, psVarA, new ocq(null, null, null, null, null), new ocq(map), new pq());
                ulz ulzVar = pu.a;
                try {
                    Trace.beginSection("CameraPipe");
                    kyz kyzVar = new kyz(new ocq(prVar, (byte[]) null), new qqv(prVar.b));
                    Trace.endSection();
                    return new pt(kyzVar);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 16:
                return new pci((ScheduledExecutorService) this.a.a(), ((pba) this.c).a(), ((jaf) this.b).b());
            case 17:
                return new lat((pmg) this.a.a(), (mwq) this.c.a(), ((pgg) this.b).a());
            case 18:
                tzx tzxVar5 = this.b;
                SensorManager sensorManagerA = ((inh) this.c).a();
                boolean z = ((pnp) tzxVar5.a()).a;
                return pkx.d(sensorManagerA, 1) ? rwc.j((plc) this.a.a()) : rvk.a;
            case 19:
                tzx tzxVar6 = this.b;
                SensorManager sensorManagerA2 = ((inh) this.c).a();
                boolean z2 = ((pnp) tzxVar6.a()).a;
                return pkx.d(sensorManagerA2, 4) ? rwc.j((plc) this.a.a()) : rvk.a;
            default:
                ree reeVar = (ree) this.a.a();
                rwc rwcVar = (rwc) ((tzu) this.c).a;
                Context contextB2 = ((imm) this.b).b();
                Pattern pattern = rcl.a;
                rck rckVar = new rck(contextB2);
                rckVar.d("datadownloadmanifest");
                rckVar.e((String) rwcVar.e("datadownload"));
                Uri uriBuild = rckVar.a().buildUpon().appendPath("download_metadata.pb").build();
                reb rebVarA = rec.a();
                rebVarA.e(uriBuild);
                rebVarA.d(pxn.a);
                return reeVar.a(rebVarA.a());
        }
    }

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, short[] sArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }

    public mqg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }
}
