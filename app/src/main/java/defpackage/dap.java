package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import androidx.preference.DialogPreference;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dap extends bb implements DialogInterface.OnClickListener {
    private DialogPreference ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    public int ak;
    private CharSequence al;
    private int am;
    private BitmapDrawable an;

    protected void B(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.al;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void C(boolean z);

    protected boolean D() {
        return false;
    }

    public final DialogPreference F() {
        if (this.ag == null) {
            this.ag = (DialogPreference) ((czz) getTargetFragment()).a(requireArguments().getString("key"));
        }
        return this.ag;
    }

    protected void dA(du duVar) {
    }

    @Override // defpackage.bb
    public final Dialog f() {
        this.ak = -2;
        du duVar = new du(requireContext());
        duVar.f(this.ah);
        duVar.d(this.an);
        duVar.j(this.ai, this);
        duVar.i(this.aj, this);
        requireContext();
        int i = this.am;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterL = this.W;
            if (layoutInflaterL == null) {
                layoutInflaterL = l(null);
            }
            viewInflate = layoutInflaterL.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            B(viewInflate);
            duVar.g(viewInflate);
        } else {
            duVar.h(this.al);
        }
        dA(duVar);
        dv dvVarB = duVar.b();
        if (D()) {
            dvVarB.getWindow().getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
        return dvVarB;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ak = i;
    }

    @Override // defpackage.bb, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C(this.ak == -1);
    }

    @Override // defpackage.bb, defpackage.bm
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        deu targetFragment = getTargetFragment();
        if (targetFragment instanceof czz) {
            czz czzVar = (czz) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) czzVar.a(string);
                this.ag = dialogPreference;
                this.ah = dialogPreference.a;
                this.ai = dialogPreference.d;
                this.aj = dialogPreference.e;
                this.al = dialogPreference.b;
                this.am = dialogPreference.f;
                Drawable drawable = dialogPreference.c;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.an = new BitmapDrawable(getResources(), bitmapCreateBitmap);
                    return;
                }
                this.an = (BitmapDrawable) drawable;
                return;
            }
            this.ah = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ai = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.aj = bundle.getCharSequence(LmJPKwPBa.tYU);
            this.al = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.am = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.an = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // defpackage.bb, defpackage.bm
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ah);
        bundle.putCharSequence(CZAHo.zCrG, this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.al);
        bundle.putInt("PreferenceDialogFragment.layout", this.am);
        BitmapDrawable bitmapDrawable = this.an;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
