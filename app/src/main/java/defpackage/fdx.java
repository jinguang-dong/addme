package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fdx implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fdx(bb bbVar, int i) {
        this.b = i;
        this.a = bbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        View.OnClickListener onClickListener;
        MaterialButton materialButton;
        View.OnClickListener onClickListener2;
        MaterialButton materialButton2;
        int i = this.b;
        if (i == 0) {
            fdy fdyVar = (fdy) this.a;
            if (dialogInterface == fdyVar.i) {
                fdyVar.i = null;
                return;
            }
            return;
        }
        if (i == 1) {
            bb bbVar = (bb) this.a;
            Dialog dialog = bbVar.c;
            if (dialog != null) {
                bbVar.onDismiss(dialog);
                return;
            }
            return;
        }
        if (i == 2) {
            ((gbb) this.a).d = null;
            return;
        }
        if (i == 3) {
            ips ipsVar = (ips) this.a;
            if (!ipsVar.d || (onClickListener = ipsVar.f) == null || (materialButton = ipsVar.e) == null) {
                return;
            }
            ipsVar.d = false;
            onClickListener.onClick(materialButton);
            return;
        }
        if (i == 4) {
            ((ipz) this.a).d = Optional.empty();
            return;
        }
        if (i != 5) {
            ((mnp) this.a).e = null;
            return;
        }
        iqv iqvVar = (iqv) this.a;
        if (!iqvVar.d || (onClickListener2 = iqvVar.f) == null || (materialButton2 = iqvVar.e) == null) {
            return;
        }
        iqvVar.d = false;
        onClickListener2.onClick(materialButton2);
    }

    public /* synthetic */ fdx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
