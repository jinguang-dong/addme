package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pzn implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pzn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, qbg] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, qbg] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws IOException {
        pul pulVarC;
        int i = 19;
        int i2 = 2;
        boolean zA = true;
        switch (this.c) {
            case 0:
                qao qaoVar = (qao) this.b;
                pvc pvcVar = qaoVar.b;
                pvb pvbVar = pvcVar.c;
                if (pvbVar == null) {
                    pvbVar = pvb.a;
                }
                tpc tpcVar = (tpc) pvbVar.a(5, null);
                tpcVar.r(pvbVar);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                pvb pvbVar2 = (pvb) tpcVar.b;
                pvbVar2.b |= 32;
                pvbVar2.h = true;
                pvb pvbVar3 = (pvb) tpcVar.l();
                tpc tpcVar2 = (tpc) pvcVar.a(5, null);
                tpcVar2.r(pvcVar);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                Object obj2 = this.a;
                pvc pvcVar2 = (pvc) tpcVar2.b;
                pvbVar3.getClass();
                pvcVar2.c = pvbVar3;
                pvcVar2.b |= 1;
                pzr pzrVar = (pzr) obj2;
                return qsz.m(pzrVar.e.l(qaoVar.a, (pvc) tpcVar2.l()), new pzg(i2), pzrVar.k);
            case 1:
                return ((pzr) this.a).c(((qao) this.b).b);
            case 2:
                ((pzx) this.b).i((pzj) this.a);
                return ske.L((Exception) obj);
            case 3:
                ((pzx) this.b).i((pzj) this.a);
                return ske.M((Boolean) obj);
            case 4:
                pvr pvrVar = (pvr) obj;
                if (pvrVar == null) {
                    qbu.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return ske.L(new qah());
                }
                pvk pvkVarB = pvk.b(pvrVar.d);
                if (pvkVarB == null) {
                    pvkVarB = pvk.NONE;
                }
                if (pvkVarB != pvk.DOWNLOAD_COMPLETE) {
                    Object obj3 = this.a;
                    Object obj4 = this.b;
                    pvp pvpVar = (pvp) obj3;
                    int iAx = a.ax(pvpVar.f);
                    qag qagVar = (qag) obj4;
                    Uri uriAm = qsp.am(qagVar.a, iAx == 0 ? 1 : iAx, pvrVar.c, pvpVar.e, qagVar.b, qagVar.j, false);
                    if (uriAm != null) {
                        qagVar.d.f(pvpVar.e, uriAm);
                    }
                    pvk pvkVarB2 = pvk.b(pvrVar.d);
                    if (pvkVarB2 == null) {
                        pvkVarB2 = pvk.NONE;
                    }
                    if (pvkVarB2 == pvk.DOWNLOAD_IN_PROGRESS) {
                        qai qaiVar = qagVar.c;
                        tpc tpcVar3 = (tpc) pvrVar.a(5, null);
                        tpcVar3.r(pvrVar);
                        pvk pvkVar = pvk.SUBSCRIBED;
                        if (!tpcVar3.b.C()) {
                            tpcVar3.o();
                        }
                        pvr pvrVar2 = (pvr) tpcVar3.b;
                        pvrVar2.d = pvkVar.h;
                        pvrVar2.b |= 2;
                        return qsz.n(qaiVar.h(pvpVar, (pvr) tpcVar3.l()), new kjm(i), qagVar.k);
                    }
                }
                return syq.a;
            case 5:
                if (((pvr) obj) != null) {
                    return ske.M(true);
                }
                Object obj5 = this.a;
                qag qagVar2 = (qag) this.b;
                SharedPreferences sharedPreferencesX = qsp.x(qagVar2.a, "gms_icing_mdd_shared_file_manager_metadata", qagVar2.j);
                long j = sharedPreferencesX.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!sharedPreferencesX.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    qbu.d("%s: Unable to update file name %s", "SharedFileManager", obj5);
                    return ske.M(false);
                }
                String strH = mn.h(j, "datadownloadfile_");
                tpc tpcVarM = pvr.a.m();
                pvk pvkVar2 = pvk.SUBSCRIBED;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                pvr pvrVar3 = (pvr) tphVar;
                pvrVar3.d = pvkVar2.h;
                pvrVar3.b = 2 | pvrVar3.b;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                pvr pvrVar4 = (pvr) tpcVarM.b;
                pvrVar4.b |= 1;
                pvrVar4.c = strH;
                return qsz.n(qagVar2.c.h((pvp) obj5, (pvr) tpcVarM.l()), new pzl(obj5, 20), qagVar2.k);
            case 6:
                pvr pvrVar5 = (pvr) obj;
                Object obj6 = this.a;
                if (pvrVar5 == null) {
                    qbu.d("%s: No file entry with key %s", "SharedFileManager", obj6);
                    return ske.M(false);
                }
                Object obj7 = this.b;
                pvp pvpVar2 = (pvp) obj6;
                int iAx2 = a.ax(pvpVar2.f);
                qag qagVar3 = (qag) obj7;
                Uri uriAm2 = qsp.am(qagVar3.a, iAx2 == 0 ? 1 : iAx2, pvrVar5.c, pvpVar2.e, qagVar3.b, qagVar3.j, false);
                if (uriAm2 != null) {
                    qagVar3.d.f(pvpVar2.e, uriAm2);
                }
                return qsz.n(qagVar3.c.g(pvpVar2), new pzl(obj6, i), qagVar3.k);
            case 7:
                sbv sbvVar = (sbv) obj;
                sbr sbrVar = new sbr();
                sgj sgjVarListIterator = ((scn) this.b).listIterator();
                while (sgjVarListIterator.hasNext()) {
                    pvp pvpVar3 = (pvp) sgjVarListIterator.next();
                    if (!sbvVar.containsKey(pvpVar3)) {
                        qbu.d("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", pvpVar3);
                        return ske.L(new qah());
                    }
                    Object obj8 = this.a;
                    pvr pvrVar6 = (pvr) sbvVar.get(pvpVar3);
                    int iAx3 = a.ax(pvpVar3.f);
                    qag qagVar4 = (qag) obj8;
                    Uri uriAm3 = qsp.am(qagVar4.a, iAx3 == 0 ? 1 : iAx3, pvrVar6.c, pvrVar6.g, qagVar4.b, qagVar4.j, pvrVar6.e);
                    if (uriAm3 != null) {
                        sbrVar.f(pvpVar3, uriAm3);
                    }
                }
                return ske.M(sbrVar.e());
            case 8:
                qbu.d("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", this.a);
                ((qag) this.b).b.a();
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.SHARED_FILE_NOT_FOUND_ERROR;
                tfmVarA.d = (qah) obj;
                return ske.L(tfmVarA.c());
            case 9:
                qba qbaVar = (qba) this.b;
                pva pvaVar = qbaVar.d;
                String str = pvaVar.g;
                lat latVar = qbaVar.o;
                Object obj9 = this.a;
                if (qbc.d(latVar, (Uri) obj9, str)) {
                    return qbb.c(pvk.DOWNLOAD_COMPLETE, pvaVar, qbaVar.n, qbaVar.b, qbaVar.m);
                }
                qbu.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", obj9);
                tfm tfmVarA2 = pul.a();
                tfmVarA2.b = puk.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return ske.L(tfmVarA2.c());
            case 10:
                return this.b.a((Uri) this.a);
            case 11:
                Exception exc = (Exception) obj;
                if (exc instanceof pul) {
                    pulVarC = (pul) exc;
                } else {
                    tfm tfmVarA3 = pul.a();
                    tfmVarA3.d = exc;
                    tfmVarA3.b = puk.UNKNOWN_ERROR;
                    pulVarC = tfmVarA3.c();
                }
                return qsz.n(this.a.b(pulVarC), new qaz(exc, 7), ((qbh) this.b).f);
            case 12:
                ((syv) this.b).run();
                return this.a;
            case 13:
                Object obj10 = this.a;
                Object obj11 = (Set) ((Map) obj).get(obj10);
                if (obj11 == null) {
                    obj11 = sfd.a;
                }
                return ((qbo) this.b).e(sbv.n(obj10, obj11));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj12 = this.b;
                tdy tdyVar = (tdy) this.a;
                return zBooleanValue ? ((tql) tdyVar.c).e((String) obj12) : ((tql) tdyVar.b).e((String) obj12);
            case 15:
                int i3 = sbp.d;
                return qay.c(this.a, (puh) obj, sex.a);
            case 16:
                puh puhVar = (puh) obj;
                rnt.Z(ujp.aG(puhVar.c, new pzw(12)), ",");
                int i4 = qbu.a;
                int i5 = sbp.d;
                return qay.c(this.a, puhVar, sex.a);
            case 17:
                return ((qss) this.a).g.b(qss.r((uzm) obj, (qsw) this.b));
            case 18:
                qwa qwaVar = (qwa) obj;
                tpc tpcVar4 = (tpc) qwaVar.a(5, null);
                tpcVar4.r(qwaVar);
                tpe tpeVar = (tpe) tpcVar4;
                if (!tpeVar.b.C()) {
                    tpeVar.o();
                }
                Object obj13 = this.a;
                Object obj14 = this.b;
                qwa qwaVar2 = (qwa) tpeVar.b;
                qwa qwaVar3 = qwa.a;
                obj14.getClass();
                qwaVar2.c = (uzu) obj14;
                qwaVar2.b |= 1;
                qwm qwmVar = (qwm) obj13;
                return qwmVar.e.a(qwmVar.a, (qwa) tpeVar.l());
            case 19:
                int i6 = qzu.a;
                int i7 = sbp.d;
                sbk sbkVar = new sbk();
                Context context = ((qxf) this.a).c;
                sbkVar.h(context);
                int i8 = prt.a;
                sbkVar.h(prt.a(context));
                sbp sbpVarG = sbkVar.g();
                int i9 = ((sex) sbpVarG).c;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object obj15 = this.b;
                    File file = new File(String.valueOf(((Context) sbpVarG.get(i10)).getFilesDir()) + "/phenotype/shared/" + ((String) obj15));
                    if (file.exists()) {
                        zA = qzu.a(file);
                    }
                }
                return zA ? syq.a : ske.L(new IOException("Unable to remove snapshots for removed user"));
            default:
                qzw qzwVar = (qzw) this.a;
                return ((qqe) qzwVar.d.fr()).e(new qzv(qzwVar, (qzx) this.b));
        }
    }

    public /* synthetic */ pzn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
