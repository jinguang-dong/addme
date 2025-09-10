package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.dbi;
import defpackage.dbj;
import defpackage.dbk;
import defpackage.now;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SeekBarPreference extends Preference {
    private final boolean F;
    private final SeekBar.OnSeekBarChangeListener G;
    private final View.OnKeyListener H;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.G = new now(this, 1);
        this.H = new dbj(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.F = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (V() && i != q(~i)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putInt(this.r, i);
                super.P(editorB);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        dbhVar.a.setOnKeyListener(this.H);
        this.d = (SeekBar) dbhVar.B(R.id.seekbar);
        TextView textView = (TextView) dbhVar.B(R.id.seekbar_value);
        this.i = textView;
        if (this.F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.G);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(U());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dy() {
        Parcelable parcelableDy = super.dy();
        if (this.v) {
            return parcelableDy;
        }
        dbk dbkVar = new dbk(parcelableDy);
        dbkVar.a = this.a;
        dbkVar.b = this.b;
        dbkVar.c = this.g;
        return dbkVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(dbk.class)) {
            super.g(parcelable);
            return;
        }
        dbk dbkVar = (dbk) parcelable;
        super.g(dbkVar.getSuperState());
        this.a = dbkVar.a;
        this.b = dbkVar.b;
        this.g = dbkVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(q(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (R(Integer.valueOf(progress))) {
                o(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                l(this.a);
            }
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
