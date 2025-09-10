package com.google.android.clockwork.common.wearable.wearmaterial.time;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.widget.CurvedTextView;
import com.google.ar.core.R;
import defpackage.cmo;
import defpackage.nwj;
import defpackage.nyp;
import defpackage.nyr;
import defpackage.nyt;
import defpackage.nyy;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearTimeText extends FrameLayout {
    nyr a;
    nyt b;
    AmbientModeSupport.AmbientController c;
    AmbientModeSupport.AmbientController d;
    private final nyy e;
    private final nyy f;
    private final nyy g;

    public WearTimeText(Context context) {
        this(context, null);
    }

    public final void a() {
        DateFormat.is24HourFormat(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        nyr nyrVar = this.a;
        Context context = getContext();
        if (!nyrVar.a) {
            context.registerReceiver((BroadcastReceiver) nyrVar.c, (IntentFilter) nyrVar.b);
            nyrVar.a = true;
        }
        nyt nytVar = new nyt(getHandler(), this.d);
        this.b = nytVar;
        Context context2 = getContext();
        if (nytVar.a) {
            return;
        }
        context2.getContentResolver().registerContentObserver(Settings.System.getUriFor("time_12_24"), true, (ContentObserver) nytVar.b);
        nytVar.a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            nyr nyrVar = this.a;
            Context context = getContext();
            if (nyrVar.a) {
                context.unregisterReceiver((BroadcastReceiver) nyrVar.c);
                nyrVar.a = false;
            }
        } catch (IllegalArgumentException unused) {
        }
        nyt nytVar = this.b;
        if (nytVar != null) {
            Context context2 = getContext();
            if (nytVar.a) {
                context2.getContentResolver().unregisterContentObserver((ContentObserver) nytVar.b);
                nytVar.a = false;
            }
            this.b = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getPaddingTop() + getResources().getDimensionPixelSize(R.dimen.wear_time_text_size));
        setPivotX(getMeasuredWidth() / 2.0f);
    }

    public WearTimeText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WearTimeText(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        if (context.getResources().getConfiguration().isScreenRound()) {
            LayoutInflater.from(context).inflate(R.layout.curved_time_text, (ViewGroup) this, true);
            this.f = nwj.m((CurvedTextView) findViewById(R.id.wear_time_text_clock));
            this.e = nwj.m((CurvedTextView) findViewById(R.id.wear_time_text_divider));
            this.g = nwj.m((CurvedTextView) findViewById(R.id.wear_time_text_title));
        } else {
            LayoutInflater.from(context).inflate(R.layout.straight_time_text, (ViewGroup) this, true);
            this.f = nwj.m((TextView) findViewById(R.id.wear_time_text_clock));
            this.e = nwj.m((TextView) findViewById(R.id.wear_time_text_divider));
            this.g = nwj.m((TextView) findViewById(R.id.wear_time_text_title));
        }
        this.e.c("·");
        getResources().getDimensionPixelSize(R.dimen.wear_time_max_fade_out_scroll);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nyp.a, i, i);
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        this.g.d(color);
        this.e.d(color);
        String string = typedArrayObtainStyledAttributes.getString(1);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        this.g.c(string);
        View viewB = this.g.b();
        int i2 = true != zIsEmpty ? 0 : 8;
        viewB.setVisibility(i2);
        this.e.b().setVisibility(i2);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = cmo.a;
        float[] components = Color.valueOf(this.f.a()).convert(ColorSpace.get(ColorSpace.Named.CIE_LAB)).getComponents();
        components[0] = 80.0f;
        this.f.d(Color.valueOf(components, ColorSpace.get(ColorSpace.Named.CIE_LAB)).toArgb());
        Calendar.getInstance();
        this.c = new AmbientModeSupport.AmbientController(this);
        this.a = new nyr(this.c);
        this.d = new AmbientModeSupport.AmbientController(this, null);
    }
}
