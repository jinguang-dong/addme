package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fjx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fjx(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        int i = this.c;
        int i2 = 2;
        if (i == 0) {
            fjz fjzVar = (fjz) this.b;
            fjzVar.f();
            int i3 = this.a;
            if (i3 == 2) {
                fjzVar.n(3);
            } else {
                i2 = i3;
            }
            fjzVar.l(i2);
            return;
        }
        if (i == 1) {
            fjz fjzVar2 = (fjz) this.b;
            fjzVar2.S.ak("step_by_step_bottom_sheet_skip_instructions");
            fjzVar2.n.a(false);
            fjzVar2.f();
            fjzVar2.l(this.a);
            return;
        }
        if (i != 2) {
            Object obj = this.b;
            ModeSlider modeSlider = (ModeSlider) obj;
            modeSlider.c.b(true);
            modeSlider.h(this.a, true);
            modeSlider.c.a((View) obj, true);
            return;
        }
        Object obj2 = this.b;
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) obj2;
        recordSpeedSlider.c.b(true);
        recordSpeedSlider.h(this.a, true);
        recordSpeedSlider.c.a((View) obj2, true);
    }
}
