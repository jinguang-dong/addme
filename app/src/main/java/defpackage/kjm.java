package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kjm implements sxi {
    private final /* synthetic */ int a;

    public /* synthetic */ kjm(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, syu] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws nzi {
        switch (this.a) {
            case 0:
                lmg lmgVar = (lmg) obj;
                hkw hkwVar = lmgVar.l;
                poj pojVar = lmgVar.a;
                return ske.M(lmgVar);
            case 1:
                return ((kfg) obj).i().c;
            case 2:
                Pattern pattern = nzo.a;
                return ske.L(new nzi((IOException) obj));
            case 3:
                Pattern pattern2 = nzo.a;
                return ske.L(new nzi((IOException) obj));
            case 4:
                nzz nzzVar = (nzz) obj;
                Pattern pattern3 = nzo.a;
                nzzVar.getClass();
                if (nzzVar.a.b == 416) {
                    return ske.M(0L);
                }
                throw new nzi(nzzVar);
            case 5:
                obu obuVar = (obu) obj;
                obuVar.getClass();
                ((UrlRequest) obuVar.a).start();
                return obuVar.b;
            case 6:
                nzo nzoVar = (nzo) obj;
                nzoVar.h.set(0);
                syn synVarB = nzoVar.b(nzoVar.d.a);
                int i = 4;
                jmx jmxVar = new jmx(nzoVar, i);
                Executor executor = nzoVar.e;
                syu syuVarJ = swz.j(swf.j(swf.j(swz.j(synVarB, jmxVar, executor), nzz.class, new kjm(i), executor), Throwable.class, new jmx(nzoVar, 5), executor), new jmx(nzoVar, 6), executor);
                ((swn) syuVarJ).c(nzoVar.f, executor);
                return syuVarJ;
            case 7:
                List list = (List) obj;
                if (list == null) {
                    return ske.L(new IllegalStateException());
                }
                pdo pdoVar = (pdo) list.get(0);
                pdo pdoVar2 = (pdo) list.get(1);
                return pdoVar.c > pdoVar2.c ? ske.M(pdoVar) : ske.M(pdoVar2);
            case 8:
                sbp sbpVar = (sbp) obj;
                int i2 = sbp.d;
                sbk sbkVar = new sbk();
                int size = sbpVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    try {
                        sbkVar.h(qsp.R(((qao) sbpVar.get(i3)).b));
                    } catch (tpz e) {
                        return ske.L(e);
                    }
                }
                return ske.M(sbkVar.g());
            case 9:
                pvc pvcVar = (pvc) obj;
                return ske.M(pvcVar != null ? rwc.j(qsp.R(pvcVar)) : rvk.a);
            case 10:
                qbu.g((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                return ske.M(false);
            case 11:
                rwc rwcVar = (rwc) obj;
                if (rwcVar.h()) {
                    int i4 = qbu.a;
                    ((syu) rwcVar.c()).cancel(false);
                }
                return syq.a;
            case 12:
                return ske.M(pua.SUCCESS);
            case 13:
                int i5 = qbu.a;
                return syq.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return syq.a;
            case 15:
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                tfmVarA.d = (IOException) obj;
                return ske.L(tfmVarA.c());
            case 16:
                return syq.a;
            case 17:
                boolean z = pzr.a;
                return qsp.N((List) obj).f(new ire(18), sxo.a);
            case 18:
                pvc pvcVar2 = (pvc) obj;
                if (pvcVar2 == null) {
                    pvcVar2 = pvc.a;
                }
                return ske.M(pvcVar2);
            case 19:
                return syq.a;
            default:
                pvk pvkVarB = pvk.b(((pvr) obj).d);
                if (pvkVarB == null) {
                    pvkVarB = pvk.NONE;
                }
                return ske.M(pvkVarB);
        }
    }
}
