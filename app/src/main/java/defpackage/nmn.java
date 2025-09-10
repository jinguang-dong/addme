package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmn implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public nmn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        sbp sbpVarJ;
        switch (this.a) {
            case 0:
                return new ggg(((jag) this.b).a(), (byte[]) null);
            case 1:
                owq owqVar = (owq) this.b.a();
                owqVar.getClass();
                return owqVar;
            case 2:
                return new ocq((hbj) this.b.a());
            case 3:
                gzi gziVar = gym.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 4:
                return new nrc();
            case 5:
                hbj hbjVar = (hbj) this.b.a();
                ArrayList arrayList = new ArrayList();
                if (hbjVar.p(hay.c)) {
                    arrayList.add(nkw.NIGHT_SIGHT.name());
                    if (hbjVar.p(hak.g)) {
                        arrayList.add(nkw.PORTRAIT.name());
                    }
                    arrayList.add(nkw.PHOTO.name());
                    arrayList.add(nkw.VIDEO.name());
                    if (hbjVar.p(gzo.aE)) {
                        arrayList.add(nkw.SLOW_MOTION.name());
                    }
                    arrayList.add(nkw.TIME_LAPSE.name());
                    if (hbjVar.p(gym.aj)) {
                        arrayList.add(nkw.AMBER.name());
                    }
                    sbpVarJ = sbp.j(arrayList);
                } else {
                    sbpVarJ = sbp.j(arrayList);
                }
                sbpVarJ.getClass();
                return sbpVarJ;
            case 6:
                return new oxo((pfl) this.b.a());
            case 7:
                return new pez((rcg) this.b.a());
            case 8:
                pbc pbcVarA = ((pba) this.b).a();
                sfd sfdVar2 = sfd.a;
                return new rcg(sfdVar2, scn.I(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AE_LOCK, CaptureRequest.CONTROL_AWB_LOCK), sfdVar2, sfdVar2, pbcVarA);
            case 9:
                Object obj = ((pfl) this.b).a;
                sfd sfdVar3 = sfd.a;
                sfdVar3.getClass();
                return sfdVar3;
            case 10:
                scn scnVar = ((pfn) this.b).a().m;
                scnVar.getClass();
                return scnVar;
            case 11:
                return new pmg((pmj) this.b.a());
            case 12:
                return new pit(((pba) this.b).a());
            case 13:
                return new qpt((pfi) this.b.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new pit(((piv) this.b).a());
            case 15:
                mtd mtdVar = new mtd((qpt) this.b.a(), 20);
                return new pdq(mtdVar, mtdVar);
            case 16:
                return new ple(((inh) this.b).a());
            case 17:
                return new plf(((inh) this.b).a());
            case 18:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.a();
                scheduledExecutorService.getClass();
                return new uoe(scheduledExecutorService);
            case 19:
                return new pnc(((pmy) this.b).a());
            default:
                return new qaq(((mfx) this.b).a());
        }
    }
}
