package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fus implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        switch (this.d) {
            case 0:
                return new jzw((nms) this.b.a(), ((kiv) this.a).a(), ((fef) this.c).a());
            case 1:
                tzx tzxVar = this.c;
                tzx tzxVar2 = this.a;
                return ((rnn) this.b.a()).b(((gno) tzxVar.a()).g((Executor) tzxVar2.a()));
            case 2:
                return new khb(((ixw) this.a).a(), (owf) this.b.a(), (out) this.c.a());
            case 3:
                return new got(((gar) this.a).a(), ((gef) this.b).a(), (geh) this.c.a());
            case 4:
                return new fwr(tzs.b(this.c), tzs.b(this.b), (fyw) this.a.a());
            case 5:
                return new fyb(((ngx) this.b).a(), (out) this.c.a(), (mwq) this.a.a());
            case 6:
                owq owqVar = (owq) this.c.a();
                gzi gziVar = hax.a;
                Object sfmVar2 = ((Boolean) owqVar.dL()).booleanValue() ? new sfm(((gdf) this.b).a()) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 7:
                gdg gdgVarA = ((gdh) this.c).a();
                if (((Boolean) this.b.a()).booleanValue()) {
                    sfmVar = new sfm(gdgVarA);
                } else {
                    gzi gziVar2 = hax.a;
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 8:
                return new gjj((hie) this.b.a(), (qrh) this.a.a(), (owq) this.c.a());
            case 9:
                return new gko((mhq) this.a.a(), ((mia) this.c).b(), (out) this.b.a());
            case 10:
                return new gkr(this.c, (ScheduledExecutorService) this.b.a(), (hbj) this.a.a());
            case 11:
                luj lujVar = (luj) this.b.a();
                luj lujVar2 = (luj) this.c.a();
                owf owfVar = (owf) this.a.a();
                gly glyVar = new gly(lujVar2.a(luf.E));
                fme fmeVar = new fme(owfVar, 6);
                glv glvVar = new glv(glyVar, 0);
                owq owqVarA = lujVar.a(luf.K);
                glw glwVar = new glw(owqVarA, fmeVar, owfVar, 0);
                ksh kshVarM = ksi.m();
                kshVarM.n(krs.BACK_VIDEO_FLASH);
                kshVarM.h(R.string.flash_desc);
                kshVarM.c(R.string.flash_options_desc);
                kshVarM.a = glyVar;
                kshVarM.b = fmeVar;
                kshVarM.f = glvVar;
                kshVarM.e = glwVar;
                kshVarM.c = new glx(owqVarA, 1);
                kshVarM.b(ksa.VIDEO_FLASH_OFF, R.drawable.quantum_gm_ic_flash_off_white_24, R.string.cam_flash_off, R.string.flash_off_desc);
                kshVarM.b(ksa.VIDEO_FLASH_ON, R.drawable.quantum_gm_ic_flash_on_white_24, R.string.cam_flash_on, R.string.flash_on_desc);
                return kshVarM.a();
            case 12:
                hbj hbjVar = (hbj) this.a.a();
                luj lujVar3 = (luj) this.c.a();
                owf owfVar2 = (owf) this.b.a();
                gly glyVar2 = new gly(lujVar3.a(luf.F));
                glx glxVar = new glx(owfVar2, 0);
                gok gokVar = new gok(owfVar2, 1);
                ksh kshVarM2 = ksi.m();
                kshVarM2.n(krs.j);
                kshVarM2.a = glyVar2;
                kshVarM2.b = glxVar;
                kshVarM2.e = gokVar;
                if (hbjVar.o(haf.c)) {
                    kshVarM2.f = new fvk(glyVar2, 2);
                    kshVarM2.h(R.string.flash_desc);
                    kshVarM2.c(R.string.flash_options_desc);
                    kshVarM2.b(ksa.VIDEO_FLASH_OFF, R.drawable.quantum_gm_ic_flash_off_white_24, R.string.cam_flash_off, R.string.flash_off_desc);
                    kshVarM2.b(ksa.VIDEO_FLASH_ON, R.drawable.quantum_gm_ic_flash_on_white_24, R.string.cam_flash_on, R.string.flash_on_desc);
                } else {
                    kshVarM2.h(R.string.illumination_desc);
                    kshVarM2.c(R.string.illumination_options_desc);
                    kshVarM2.b(ksa.VIDEO_FLASH_OFF, R.drawable.ic_lightbulb_off, R.string.illumination_off_option_desc, R.string.illumination_off_desc);
                    kshVarM2.b(ksa.VIDEO_FLASH_ON, R.drawable.ic_lightbulb_on, R.string.illumination_on_option_desc, R.string.illumination_on_desc);
                }
                return kshVarM2.a();
            case 13:
                hbj hbjVar2 = (hbj) this.b.a();
                ((ixw) this.a).a();
                hax.d(hbjVar2);
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.c.a();
                boolean zBooleanValue = ((Boolean) this.a.a()).booleanValue();
                gmo gmoVar = (gmo) this.b.a();
                Object sfmVar3 = (!zBooleanValue || gmoVar.c.getInt("perf_key_show_p11_smarts_dismiss_count", 0) == 5) ? sfd.a : new sfm(new gmh(ambientController, gmoVar, 1));
                sfmVar3.getClass();
                return sfmVar3;
            case 15:
                AmbientMode.AmbientController ambientController2 = (AmbientMode.AmbientController) this.c.a();
                boolean zBooleanValue2 = ((Boolean) this.a.a()).booleanValue();
                gmq gmqVar = (gmq) this.b.a();
                Object sfmVar4 = (zBooleanValue2 && gmqVar.e.p(hax.e) && gmqVar.b.getInt("pref_key_p11_5x_zoom_smarts_dismiss_count", 0) != 5) ? new sfm(new gmh(ambientController2, gmqVar, 0)) : sfd.a;
                sfmVar4.getClass();
                return sfmVar4;
            case 16:
                return new got((luj) this.b.a(), ((imm) this.a).b(), ((mgg) this.c).a(), null);
            case 17:
                return new rwr((muu) this.b.a(), (gmy) this.c.a(), (hbj) this.a.a());
            case 18:
                return new gno(new nnq(), (qqq) this.b.a(), ((fru) this.a).b(), (pbn) this.c.a());
            case 19:
                return new gof((out) this.c.a(), ((ixv) this.a).a(), ((imn) this.b).a());
            default:
                return new gps((hbj) this.c.a(), ((gpp) this.a).a(), ((imm) this.b).b());
        }
    }

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[] iArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public fus(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[][] fArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }
}
