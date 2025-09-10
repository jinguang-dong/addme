package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeh extends bb {
    public Dialog ag;
    public DialogInterface.OnCancelListener ah;
    private Dialog ai;

    @Override // defpackage.bb
    public final Dialog f() {
        Dialog dialog = this.ag;
        if (dialog != null) {
            return dialog;
        }
        ((bb) this).b = false;
        if (this.ai == null) {
            Context context = getContext();
            ojl.ay(context);
            this.ai = new AlertDialog.Builder(context).create();
        }
        return this.ai;
    }

    @Override // defpackage.bb, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ah;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
