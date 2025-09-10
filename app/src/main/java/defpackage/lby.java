package defpackage;

import android.os.PowerManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lby implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public lby(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                Set setA = ((tzz) this.a).a();
                scl sclVar = new scl();
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    sclVar.j(kzz.c((kit) it.next()));
                }
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 1:
                gzi gziVar = gzo.a;
                return qpt.cl();
            case 2:
                gzi gziVar2 = gzo.a;
                return hgd.a;
            case 3:
                gzi gziVar3 = gzo.a;
                return ldc.a;
            case 4:
                gzi gziVar4 = gzo.a;
                return hgd.a;
            case 5:
                return new HashSet(((Map) this.a.a()).values());
            case 6:
                owd owdVar = (owd) this.a.a();
                ovx ovxVar = new ovx(false);
                owdVar.d(new lcr(ovxVar, 0));
                return ovxVar;
            case 7:
                owd owdVar2 = (owd) this.a.a();
                our ourVar = new our();
                owdVar2.d(new lcr(ourVar, 1));
                return ourVar;
            case 8:
                owd owdVar3 = (owd) this.a.a();
                owdVar3.getClass();
                return new hwk(owdVar3, 5);
            case 9:
                ((ojl) this.a.a()).getClass();
                our ourVar2 = new our();
                return new lda(ojl.cg(ourVar2, "1CRAWHandler"), ojl.cg(ourVar2, "1CYUVHandler"), ojl.cg(ourVar2, "1CPhotoHandler"), ojl.cf(ourVar2, "1CVFHandler", -4));
            case 10:
                return new pfl((owq) this.a.a());
            case 11:
                lgm lgmVar = (lgm) ins.a(this.a);
                lgmVar.getClass();
                return lgmVar;
            case 12:
                tzj tzjVarB = tzs.b(this.a);
                tzjVarB.getClass();
                return new goq(tzjVarB, 4);
            case 13:
                lgo lgoVar = (lgo) ins.a(this.a);
                lgoVar.getClass();
                return lgoVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                lge lgeVar = (lge) ins.a(this.a);
                lgeVar.getClass();
                return lgeVar;
            case 15:
                return new rwr((hbj) this.a.a());
            case 16:
                return new kqg(((Integer) ((hbj) this.a.a()).a(hak.a).get()).intValue());
            case 17:
                return new lhe((hbj) this.a.a());
            case 18:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 19:
                PowerManager powerManager = (PowerManager) ((imm) this.a).b().getSystemService("power");
                return new ovx(Boolean.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false));
            default:
                lhv lhvVarA = ((lhw) this.a).a();
                if (hmp.b() != hbc.DOGFOOD && !ual.a.fr().b()) {
                    z = false;
                }
                qre qreVarD = qrf.d();
                qreVarD.c = lhvVarA;
                qreVarD.b(z);
                return qreVarD.a();
        }
    }
}
