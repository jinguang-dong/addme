package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.text.Spanned;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.cvm;
import defpackage.cvo;
import defpackage.nvs;
import defpackage.nvv;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContentChangeTransition extends TransitionSet {
    public static final String[] a;
    private static final Interpolator b = new cvo();
    private static final Interpolator c = new cvm();
    private static final String d;
    private static final String e;
    private static final String f;

    static {
        String name = ContentChangeTransition.class.getName();
        d = name;
        String strConcat = String.valueOf(name).concat(":content-version");
        e = strConcat;
        String strConcat2 = String.valueOf(name).concat(":visibility");
        f = strConcat2;
        a = new String[]{strConcat2, strConcat};
    }

    public ContentChangeTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrdering(1);
        nvv nvvVar = new nvv();
        nvvVar.setDuration(150L);
        nvvVar.setInterpolator(c);
        addTransition(nvvVar);
        nvs nvsVar = new nvs();
        nvsVar.setDuration(300L);
        nvsVar.setInterpolator(b);
        addTransition(nvsVar);
    }

    static int a(Map map) {
        Integer num = (Integer) map.get(e);
        return num == null ? View.generateViewId() : num.intValue();
    }

    public static void b(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Integer num = (Integer) view.getTag(R.id.tag_content_version);
        transitionValues.values.put(e, Integer.valueOf(num == null ? View.generateViewId() : num.intValue()));
        transitionValues.values.put(f, Boolean.valueOf(view.getVisibility() == 0));
    }

    static void c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (text == charSequence) {
            return;
        }
        if (text == null || charSequence == null || (text instanceof Spanned) || (charSequence instanceof Spanned) || !text.toString().contentEquals(charSequence)) {
            textView.setText(charSequence);
            textView.setTag(R.id.tag_content_version, Integer.valueOf(View.generateViewId()));
        }
    }

    static boolean d(Map map) {
        Boolean bool = (Boolean) map.get(f);
        return bool != null && bool.booleanValue();
    }

    public static boolean e(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Map map = transitionValues.values;
        Map map2 = transitionValues2.values;
        if (transitionValues.view != transitionValues2.view) {
            return false;
        }
        return d(map) && d(map2) && a(map) != a(map2);
    }
}
