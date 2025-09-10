package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuh implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;
    private final Object c;

    public kuh(Object obj, tzx tzxVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = tzxVar;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        boolean z = false;
        z = false;
        z = false;
        switch (this.b) {
            case 0:
                pkc pkcVar = (pkc) this.a.a();
                pjr pjrVar = (pjr) this.c.a();
                pkcVar.getClass();
                pjrVar.getClass();
                return pkcVar.f(pjrVar);
            case 1:
                kpt kptVar = !((Boolean) this.a.a()).booleanValue() ? new kpt() { // from class: kpu
                    @Override // defpackage.kpt
                    public final void a(poe poeVar) {
                    }
                } : (kpt) tzs.b(this.c).a();
                kptVar.getClass();
                return kptVar;
            case 2:
                Set<pej> set = (Set) this.a.a();
                pjo pjoVar = (pjo) this.c.a();
                set.getClass();
                pjoVar.getClass();
                ugw ugwVar = new ugw();
                Set setB = pjoVar.B();
                setB.getClass();
                ugwVar.addAll(setB);
                CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
                key.getClass();
                ugwVar.add(key);
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                key2.getClass();
                ugwVar.add(key2);
                CaptureRequest.Key key3 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
                key3.getClass();
                ugwVar.add(key3);
                CaptureRequest.Key key4 = CaptureRequest.STATISTICS_FACE_DETECT_MODE;
                key4.getClass();
                ugwVar.add(key4);
                Set setAU = ske.aU(ugwVar);
                ArrayList arrayList = new ArrayList(ske.bq(setAU, 10));
                Iterator it = setAU.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CaptureRequest.Key) it.next()).getName());
                }
                ugw ugwVar2 = new ugw();
                for (pej pejVar : set) {
                    if (arrayList.contains(pejVar.a.getName())) {
                        ugwVar2.add(pejVar);
                    }
                }
                Set setAU2 = ske.aU(ugwVar2);
                setAU2.getClass();
                return setAU2;
            case 3:
                hbj hbjVar = (hbj) this.a.a();
                pnq pnqVar = (pnq) this.c.a();
                hbjVar.getClass();
                pnqVar.getClass();
                scl sclVar = new scl();
                if (hbjVar.o(gzo.am)) {
                    sclVar.d(2);
                }
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 4:
                return new frf(new kee(((hkc) this.c).b(), (ovx) this.a.a(), 9, null), "nightsightaf", 0);
            case 5:
                owf owfVarCm = qpt.cm(CaptureRequest.LENS_FOCUS_DISTANCE, owl.h(((hkc) this.c).b(), new kve(((kiv) this.a).a(), false ? 1 : 0)));
                owfVarCm.getClass();
                return owfVarCm;
            case 6:
                return qpt.cd((Map) this.c.a(), (Map) this.a.a());
            case 7:
                hbj hbjVar2 = (hbj) this.c.a();
                Map map = (Map) this.a.a();
                if (hbjVar2.p(hak.w) && map.containsKey(lcz.RAW_WIDE) && map.containsKey(lcz.RAW_TELE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                Object sfmVar = ((Boolean) this.c.a()).booleanValue() ? new sfm((hzi) this.a.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 9:
                final long jLongValue = ((lbn) this.c).a().longValue();
                final gaw gawVarB = ((ggc) this.a).b();
                Optional map2 = Optional.ofNullable(gawVarB.e.f()).map(new idh(new uiq() { // from class: lbf
                    @Override // defpackage.uiq
                    public final Object a(Object obj) {
                        pas pasVar = (pas) obj;
                        pasVar.getClass();
                        pep pepVarA = peq.a();
                        pepVarA.b(gawVarB.b);
                        pepVarA.r(pet.IMAGE_READER);
                        pepVarA.i(256);
                        pepVarA.c(3);
                        pepVarA.n(pasVar);
                        pepVarA.f(true);
                        pepVarA.e(jLongValue);
                        return pepVarA.a();
                    }
                }, 14));
                map2.getClass();
                return map2;
            case 10:
                rwc rwcVar = (rwc) this.a.a();
                if (((Boolean) this.c.a()).booleanValue()) {
                    return rvk.a;
                }
                a.I(rwcVar.h());
                return rwc.j((peo) rwcVar.c());
            case 11:
                return ((rwc) this.a.a()).b(new kve((pfu) this.c.a(), 3));
            case 12:
                pfu pfuVar = (pfu) this.c.a();
                return new lff(pfuVar);
            case 13:
                return ((lhe) this.c.a()).b ? rwc.j((kye) this.a.a()) : rvk.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((hbj) this.a.a()).p(haz.a) ? ((jaf) this.c).b() : rvk.a;
            case 15:
                ((jdg) this.a).b();
                Object obj = ((qav) this.c).h;
                obj.getClass();
                return obj;
            case 16:
                tzx tzxVar = this.a;
                Context contextB = ((jdg) this.c).b();
                rwc rwcVar2 = (rwc) tzxVar.a();
                Pattern pattern = rcl.a;
                rck rckVar = new rck(contextB);
                rckVar.d("mdd_pds_config");
                rckVar.e(qsp.al("DestFileGroups", rwcVar2));
                Uri uriA = rckVar.a();
                uriA.getClass();
                return uriA;
            case 17:
                tzx tzxVar2 = this.a;
                Context contextB2 = ((jdg) this.c).b();
                rwc rwcVar3 = (rwc) tzxVar2.a();
                Pattern pattern2 = rcl.a;
                rck rckVar2 = new rck(contextB2);
                rckVar2.d("mdd_pds_config");
                rckVar2.e(qsp.al("DiagFileGroups", rwcVar3));
                Uri uriA2 = rckVar2.a();
                uriA2.getClass();
                return uriA2;
            case 18:
                tzx tzxVar3 = this.a;
                Context contextB3 = ((jdg) this.c).b();
                rwc rwcVar4 = (rwc) tzxVar3.a();
                Pattern pattern3 = rcl.a;
                rck rckVar3 = new rck(contextB3);
                rckVar3.d("mdd_pds_config");
                rckVar3.e(qsp.al("DestSharedFiles", rwcVar4));
                Uri uriA3 = rckVar3.a();
                uriA3.getClass();
                return uriA3;
            case 19:
                tzx tzxVar4 = this.a;
                Context contextB4 = ((jdg) this.c).b();
                rwc rwcVar5 = (rwc) tzxVar4.a();
                Pattern pattern4 = rcl.a;
                rck rckVar4 = new rck(contextB4);
                rckVar4.d("mdd_pds_config");
                rckVar4.e(qsp.al("DiagSharedFiles", rwcVar5));
                Uri uriA4 = rckVar4.a();
                uriA4.getClass();
                return uriA4;
            default:
                return new rqh(((jdg) this.a).b(), (rtl) this.c.a());
        }
    }

    public kuh(tzx tzxVar, tzx tzxVar2, int i) {
        this.b = i;
        this.a = tzxVar;
        this.c = tzxVar2;
    }
}
