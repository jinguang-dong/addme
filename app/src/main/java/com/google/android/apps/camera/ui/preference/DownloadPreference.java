package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.ar.core.R;
import defpackage.eor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DownloadPreference extends Preference {
    public static final /* synthetic */ int a = 0;
    private ImageButton b;

    public DownloadPreference(Context context) {
        super(context);
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        this.b = (ImageButton) view.findViewById(R.id.button_widget);
        ImageButton imageButton = this.b;
        if (imageButton != null) {
            imageButton.setImageResource(0);
            this.b.setTag(0);
            this.b.setOnClickListener(new eor(4));
        }
    }

    @Override // android.preference.Preference
    protected final View onCreateView(ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        return LayoutInflater.from(getContext()).inflate(R.layout.preference_with_download_button, viewGroup, false);
    }

    public DownloadPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DownloadPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
