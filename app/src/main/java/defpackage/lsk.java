package defpackage;

import android.content.SharedPreferences;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsk implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public lsk(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new ggg((mfq) this.a.a(), (byte[]) null);
            case 1:
                return new ggg((uem) this.a);
            case 2:
                return new owd((pbn) this.a.a());
            case 3:
                return new lti((owq) this.a.a());
            case 4:
                return new lac((lti) this.a.a(), 7);
            case 5:
                return new ocq((SharedPreferences) this.a.a(), (byte[]) null);
            case 6:
                return ((luo) this.a).a().m("pref_camera_advice_settings", true);
            case 7:
                return ((luo) this.a).a().n("pref_af_mode_back", ltq.ON.f);
            case 8:
                return ((luo) this.a).a().n("pref_af_mode_front", ltq.ON.f);
            case 9:
                gzi gziVar = gym.a;
                lty ltyVar = lty.RES_1080P;
                ltyVar.getClass();
                return ltyVar;
            case 10:
                return ((luo) this.a).a().m("perf_has_run_first_education", false);
            case 11:
                return ((luo) this.a).a().m("pref_has_checked_gouda_mode", false);
            case 12:
                return ((luo) this.a).a().m("pref_camera_enable_iris", true);
            case 13:
                return ((luo) this.a).a().m("pref_has_shown_longp_education", false);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((luo) this.a).a().n("pref_switch_to_next_mode_command_string", 72);
            case 15:
                return ((luo) this.a).a().m("perf_has_shown_options_bar", false);
            case 16:
                luj lujVar = (luj) this.a.a();
                pfl pflVar = new pfl((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                pflVar.p(lujVar.a(luf.E));
                pflVar.p(lujVar.a(luf.F));
                pflVar.p(lujVar.a(luf.J));
                return pflVar;
            case 17:
                return ((luo) this.a).a().n("pref_switch_to_previous_mode_command_string", 71);
            case 18:
                return ((luo) this.a).a().o("pref_camera_resolution", "full");
            case 19:
                return ((luo) this.a).a().m("perf_has_run_second_education", false);
            default:
                return ((luo) this.a).a().n("pref_shutter_command_string", 66);
        }
    }
}
