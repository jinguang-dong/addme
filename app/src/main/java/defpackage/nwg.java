package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwg extends cnn {
    final /* synthetic */ WearChipButton a;
    private final WearChipButton b;

    public nwg(WearChipButton wearChipButton, WearChipButton wearChipButton2) {
        this.a = wearChipButton;
        this.b = wearChipButton2;
    }

    private final void k(AccessibilityEvent accessibilityEvent) {
        nwf nwfVarJ = j();
        accessibilityEvent.setClassName(nwfVarJ.a);
        if (accessibilityEvent.getContentChangeTypes() != 64) {
            CharSequence charSequence = nwfVarJ.b;
            if (charSequence.length() > 0) {
                accessibilityEvent.getText().add(charSequence);
            }
            CharSequence charSequence2 = nwfVarJ.c;
            if (charSequence2.length() > 0) {
                accessibilityEvent.getText().add(charSequence2);
            }
        }
        accessibilityEvent.setChecked(this.b.p);
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        k(accessibilityEvent);
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        nwf nwfVarJ = j();
        cptVar.m(nwfVarJ.a);
        cptVar.z(nwfVarJ.a());
        WearChipButton wearChipButton = this.b;
        cptVar.k(wearChipButton.q);
        cptVar.l(wearChipButton.p);
    }

    @Override // defpackage.cnn
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        k(accessibilityEvent);
    }

    public final nwf j() {
        WearChipButton wearChipButton = this.a;
        CompoundButton compoundButton = wearChipButton.s;
        return new nwf(compoundButton == null ? null : compoundButton.getAccessibilityClassName(), wearChipButton.m(), null);
    }
}
