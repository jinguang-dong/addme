package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.preference.Preference;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.ar.core.R;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StorageStatusPreference extends Preference {
    private static final Typeface e = Typeface.create("sans-serif-medium", 0);
    public long a;
    public long b;
    public int c;
    public int d;
    private TextView f;
    private TextView g;
    private ProgressBar h;

    public StorageStatusPreference(Context context) {
        super(context);
        this.a = -1L;
        this.b = -1L;
    }

    public final void a() throws Resources.NotFoundException {
        ProgressBar progressBar;
        if (this.f == null || this.g == null || (progressBar = this.h) == null) {
            return;
        }
        long j = this.b;
        progressBar.setProgress(Math.round(100.0f - (j == 0 ? 0.0f : (this.a * 100.0f) / j)));
        Resources resources = getContext().getResources();
        this.f.setText(resources.getString(R.string.storage_remaining, Formatter.formatFileSize(getContext(), this.a)));
        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(this.c);
        String str2 = numberFormat.format(this.d);
        String string = resources.getString(R.string.storage_estimate, resources.getQuantityString(R.plurals.photos_remaining, this.c, str), resources.getQuantityString(R.plurals.videos_remaining, this.d, str2));
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(e), iIndexOf, str.length() + iIndexOf, 33);
        }
        int iLastIndexOf = string.lastIndexOf(str2);
        if (iLastIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(e), iLastIndexOf, str2.length() + iLastIndexOf, 33);
        }
        this.g.setText(spannableString);
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) throws Resources.NotFoundException {
        super.onBindView(view);
        this.f = (TextView) view.findViewById(R.id.storage_used);
        this.g = (TextView) view.findViewById(R.id.storage_remaining);
        this.h = (ProgressBar) view.findViewById(R.id.storage_progressbar);
        a();
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1L;
        this.b = -1L;
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1L;
        this.b = -1L;
    }
}
