package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.android.settingslib.widget.BannerMessagePreferenceGroup;
import com.android.settingslib.widget.CollapsableTextView;
import com.android.settingslib.widget.SectionButtonPreference;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gx implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        switch (this.b) {
            case 0:
                ((ff) this.a).f();
                break;
            case 1:
                dt dtVar = (dt) this.a;
                if (view == dtVar.j && (message2 = dtVar.l) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view != dtVar.m || (message = dtVar.o) == null) {
                    Button button = dtVar.p;
                    messageObtain = null;
                } else {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                dtVar.H.obtainMessage(1, dtVar.b).sendToTarget();
                break;
            case 2:
                ((Toolbar) this.a).j();
                break;
            case 3:
                ((Preference) this.a).eW(view);
                break;
            case 4:
                ((BannerMessagePreferenceGroup) this.a).af();
                break;
            case 5:
                CollapsableTextView collapsableTextView = (CollapsableTextView) this.a;
                collapsableTextView.j = !collapsableTextView.j;
                collapsableTextView.g();
                break;
            case 6:
                uiq uiqVar = ((SectionButtonPreference) this.a).a;
                if (uiqVar != null) {
                    view.getClass();
                    uiqVar.a(view);
                    break;
                }
                break;
            case 7:
                fjz fjzVar = (fjz) this.a;
                fjzVar.S.al("step_by_step_bottom_sheet_skip_instructions", 0);
                fjzVar.t();
                fjzVar.n.a(true);
                break;
            case 8:
                fjz fjzVar2 = (fjz) this.a;
                Animatable animatable = (Animatable) fjzVar2.A.a.getDrawable();
                if (!animatable.isRunning()) {
                    animatable.start();
                    fjzVar2.z.setVisibility(8);
                    break;
                } else {
                    animatable.stop();
                    fjzVar2.z.setVisibility(0);
                    break;
                }
            case 9:
                fjz fjzVar3 = (fjz) this.a;
                Animatable animatable2 = (Animatable) fjzVar3.A.a.getDrawable();
                if (!animatable2.isRunning()) {
                    animatable2.start();
                    fjzVar3.z.setVisibility(8);
                    break;
                }
                break;
            case 10:
                fjz fjzVar4 = (fjz) this.a;
                fjzVar4.f();
                fjzVar4.n(1);
                break;
            case 11:
                ((fjz) this.a).m();
                break;
            case 12:
                fjz fjzVar5 = (fjz) this.a;
                fjzVar5.r(fjzVar5.L);
                fjzVar5.J.fullScroll(66);
                break;
            case 13:
                fjz fjzVar6 = (fjz) this.a;
                fjzVar6.S.al("step_by_step_bottom_sheet_skip_instructions", 0);
                fjzVar6.n(2);
                fjzVar6.n.a(true);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fjz fjzVar7 = (fjz) this.a;
                if (!fjzVar7.O) {
                    fjzVar7.r.c();
                    fjzVar7.v.setVisibility(8);
                    fjzVar7.O = true;
                    break;
                } else {
                    fjzVar7.r.a();
                    fjzVar7.v.setVisibility(0);
                    fjz.w(fjzVar7.v, fjzVar7.e.getString(R.string.play_button_action_hint));
                    fjzVar7.O = false;
                    break;
                }
            case 15:
                fjz fjzVar8 = (fjz) this.a;
                fjzVar8.r.c();
                fjzVar8.v.setVisibility(8);
                fjzVar8.O = true;
                break;
            case 16:
                ((flg) this.a).d();
                break;
            case 17:
                this.a.run();
                break;
            case 18:
                ((fng) this.a).e.d(true);
                break;
            case 19:
                ((fvu) this.a).m.k();
                break;
            default:
                ((fvu) this.a).m.i();
                break;
        }
    }

    public /* synthetic */ gx(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
