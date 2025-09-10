package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import com.google.ar.core.R;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ut {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ut() {
        this.f = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.d = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.b = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.c = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.a = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static final boolean d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList e(Context context, int i) {
        int iB = lw.b(context, R.attr.colorControlHighlight);
        int iA = lw.a(context, R.attr.colorButtonNormal);
        int[] iArr = lw.a;
        int[] iArr2 = lw.c;
        int iD = cmg.d(iB, i);
        return new ColorStateList(new int[][]{iArr, iArr2, lw.b, lw.e}, new int[]{iA, iD, cmg.d(iB, i), i});
    }

    public static final LayerDrawable f(lj ljVar, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = ljVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = ljVar.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = hr.a;
        }
        drawableMutate.setColorFilter(hr.b(i, mode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final sm h(String str, boolean z) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String strA = pp.a(str);
        Objects.toString(strA);
        try {
            Trace.beginSection(strA.concat("#readCameraMetadata"));
            try {
                Objects.toString(pp.a(str));
                Object systemService = ((Context) this.c).getSystemService("camera");
                systemService.getClass();
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                if (cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) != null) {
                    ufy ufyVar = ufy.a;
                    CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
                    linkedHashSet = new LinkedHashSet(ske.aZ(1));
                    linkedHashSet.addAll(ufyVar);
                    linkedHashSet.add(key);
                } else {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    linkedHashSet2 = ((ocq) this.a).a;
                } else {
                    Object obj = ((ocq) this.a).a;
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(ske.aZ(Integer.valueOf(linkedHashSet.size()).intValue()));
                    linkedHashSet3.addAll(obj);
                    ske.bT(linkedHashSet3, linkedHashSet);
                    linkedHashSet2 = linkedHashSet3;
                }
                sm smVar = new sm(str, cameraCharacteristics, this, linkedHashSet2);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                Objects.toString(pp.a(str));
                String.format(null, a.bE(3, "%.", "f ms"), Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)).getClass();
                return smVar;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load metadata for " + ((Object) pp.a(str)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection] */
    public final void a(Throwable th) {
        ?? r0 = this.e;
        if (r0.u(th)) {
            for (Object objI = r0.i(); uqq.c(objI); objI = r0.i()) {
                Object obj = this.b;
                uqq.d(objI);
                ((ufu) obj).add(objI);
            }
            ?? r3 = this.b;
            if (r3.isEmpty()) {
                return;
            }
            this.a.a(ske.bP(r3));
            ((ufu) r3).clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uqm] */
    public final boolean b(Object obj) {
        return uqq.c(this.e.j(obj));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final sm c(String str) {
        sm smVarH;
        str.getClass();
        String strA = pp.a(str);
        Objects.toString(strA);
        try {
            Trace.beginSection(strA.concat("#awaitMetadata"));
            ?? r0 = this.b;
            synchronized (r0) {
                smVarH = (sm) ((ArrayMap) r0).get(str);
                if (smVarH == null) {
                    if (((vb) this.d).a()) {
                        smVarH = h(str, false);
                        r0.put(str, smVarH);
                    } else {
                        smVarH = h(str, true);
                    }
                }
            }
            return smVarH;
        } finally {
            Trace.endSection();
        }
    }

    public ut(po poVar, pl plVar, wb wbVar, rg rgVar, wr wrVar, qrh qrhVar) {
        this.a = poVar;
        this.b = plVar;
        this.c = wbVar;
        this.d = rgVar;
        this.e = wrVar;
        this.f = qrhVar;
    }

    public ut(Context context, qrh qrhVar, vb vbVar, ocq ocqVar, byi byiVar) {
        qrhVar.getClass();
        vbVar.getClass();
        byiVar.getClass();
        this.c = context;
        this.e = qrhVar;
        this.d = vbVar;
        this.a = ocqVar;
        this.b = new ArrayMap();
        new ArrayMap();
        this.f = new ArrayMap();
    }

    public ut(uiq uiqVar, uiq uiqVar2, uiu uiuVar) {
        this.d = uiqVar;
        this.a = uiqVar2;
        this.f = uiuVar;
        this.c = new uly(false, umc.a);
        this.e = ukc.P(Integer.MAX_VALUE, 0, new np(this, 5), 2);
        this.b = new ufu();
    }
}
