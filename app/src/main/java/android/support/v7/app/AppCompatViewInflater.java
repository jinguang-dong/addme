package android.support.v7.app;

import android.R;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import defpackage.aaa;
import defpackage.hm;
import defpackage.ho;
import defpackage.hx;
import defpackage.ir;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] c = new Object[2];
    private static final Class[] d = {Context.class, AttributeSet.class};
    public static final int[] a = {R.attr.onClick};
    public static final String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final aaa e = new aaa();

    public hm a(Context context, AttributeSet attributeSet) {
        return new hm(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public ho c(Context context, AttributeSet attributeSet) {
        return new ho(context, attributeSet);
    }

    public hx d(Context context, AttributeSet attributeSet) {
        return new hx(context, attributeSet);
    }

    public ir e(Context context, AttributeSet attributeSet) {
        return new ir(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        aaa aaaVar = e;
        Constructor constructor = (Constructor) aaaVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(d);
            aaaVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.c);
    }
}
