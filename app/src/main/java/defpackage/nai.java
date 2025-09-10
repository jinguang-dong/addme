package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.TypedValue;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nai {
    public int a;
    public int b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public List l;
    public nah m;
    public nah n;
    private final Context o;

    public nai(Context context, int i, int i2) {
        context.getClass();
        this.o = context;
        this.a = i;
        this.b = i2;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.selected_mode_chip_height);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mode_chip_inset_horizontal);
        this.l = ufw.a;
        Trace.beginSection("SelectedModeChip#init");
        try {
            this.c = new Paint();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(context.getResources().getDimension(R.dimen.mode_chip_font_size));
            paint.setTextAlign(Paint.Align.CENTER);
            ThreadLocal threadLocal = cme.a;
            paint.setTypeface(Typeface.create(context.isRestricted() ? null : cme.b(context, R.font.google_sans_flex, new TypedValue(), 0, null, false, false), 600, false));
            paint.setFontVariationSettings("'ROND' 100, 'wdth' 100");
            paint.setAntiAlias(true);
            this.d = paint;
        } finally {
            Trace.endSection();
        }
    }
}
