package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebn {
    public final Object a;
    public final Object b;

    public ebn() {
        this.a = byi.bf(1.0f, 1400.0f, null, 4);
        this.b = byi.bf(1.0f, 260.0f, null, 4);
    }

    public static /* synthetic */ List j(Object[] objArr) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final boolean u(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener v(KeyListener keyListener) {
        if (u(keyListener) && !(keyListener instanceof ctw)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new ctw(keyListener);
            }
        }
        return keyListener;
    }

    public final Class a() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("androidx.window.extensions.area.WindowAreaComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final /* synthetic */ void b(ejs ejsVar) {
        h(ejsVar, null);
    }

    public final void c(ejs ejsVar, int i) {
        ((gga) this.b).f(new edc((dxj) this.a, ejsVar, false, i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acn, java.lang.Object] */
    public final acn d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acn, java.lang.Object] */
    public final acn e() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    public final void f(boolean z, int i) {
        this.a.onScrollLimit(i, 4194304, 26, z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void g(djk djkVar, djq djqVar) {
        List listB = AmbientModeSupport.AmbientCallback.b(djqVar);
        if (!listB.isEmpty()) {
            ListIterator listIterator = listB.listIterator(listB.size());
            while (listIterator.hasPrevious()) {
                djkVar = ((djz) listIterator.previous()).a(djkVar);
            }
        }
        this.a.add(djkVar);
    }

    public final void h(ejs ejsVar, cpo cpoVar) {
        ((gga) this.b).f(new as((Object) this, (Object) ejsVar, (Object) cpoVar, 4, (byte[]) null));
    }

    public final void i(Runnable runnable) {
        ((Choreographer) this.b).postFrameCallback(new msm(runnable, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final bsr k() {
        return (bsr) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean l(long j) {
        Object obj;
        ?? r6 = ((cpq) this.a).a;
        int size = r6.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (a.q(((bpx) obj).a, j)) {
                break;
            }
            i++;
        }
        bpx bpxVar = (bpx) obj;
        if (bpxVar != null) {
            return bpxVar.h;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final avc m(ave aveVar) {
        return (avc) this.b.get(aveVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void n(ave aveVar) {
        ?? r0 = this.b;
        avc avcVar = (avc) r0.get(aveVar);
        if (avcVar != null) {
        }
        r0.remove(aveVar);
    }

    public final boolean o() {
        return (((bbd) this.b).e() & 1) != 0;
    }

    public final boolean p() {
        return (((bbd) this.b).e() & 2) != 0;
    }

    public final boolean q() {
        return (((bbd) this.b).e() & 4) != 0;
    }

    public final void r() {
        ((SparseIntArray) this.a).clear();
    }

    public final void s() {
        ((SparseIntArray) this.b).clear();
    }

    public final void t(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, fa.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ctz ctzVar = (ctz) ((ebn) this.a).b;
            if (ctzVar.a != z) {
                ctzVar.a = z;
                if (z) {
                    ctq.a();
                    throw null;
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection w(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof ctv) ? new ctv((TextView) ((ebn) this.a).a, inputConnection) : inputConnection;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void x(qev qevVar) {
        int i = qevVar.a;
        if (i != 0) {
            this.b.execute(new cmu(this.a, i, 0));
        } else {
            Object obj = qevVar.b;
            this.b.execute(new at((coi) this.a, (Typeface) obj, 12));
        }
    }

    public ebn(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public ebn(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public ebn(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public ebn(cbr cbrVar, chz chzVar) {
        this.a = cbrVar;
        this.b = chzVar;
    }

    public ebn(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ebn(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ebn(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public ebn(EditText editText, byte[] bArr) {
        this.b = editText;
        this.a = new ebn(editText);
    }

    public ebn(bvm bvmVar, bsr bsrVar) {
        this.a = bvmVar;
        this.b = new azz(bsrVar, bap.c);
    }

    public ebn(ClassLoader classLoader) {
        this.b = classLoader;
        WindowExtensions windowExtensions = null;
        cxb cxbVar = new cxb(classLoader, (byte[]) null);
        try {
            if (cxbVar.l() && cxbVar.m()) {
                windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            }
        } catch (Exception unused) {
        }
        this.a = windowExtensions;
    }

    public ebn(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public ebn(char[] cArr, byte[] bArr) {
        this.b = new SparseIntArray();
        this.a = new SparseIntArray();
    }

    public ebn(dxj dxjVar, gga ggaVar) {
        dxjVar.getClass();
        ggaVar.getClass();
        this.a = dxjVar;
        this.b = ggaVar;
    }

    public ebn(cwc cwcVar) {
        cwcVar.getClass();
        this.a = cwcVar;
        this.b = new ArrayList();
    }

    public ebn(String str, String str2, byte[] bArr) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public ebn(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public ebn(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new bqn(null);
        this.b = new bqn(null);
    }

    public ebn(char[] cArr) {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }

    public ebn(EditText editText) {
        this.a = editText;
        ctz ctzVar = new ctz(editText);
        this.b = ctzVar;
        editText.addTextChangedListener(ctzVar);
        editText.setEditableFactory(ctu.a());
    }

    public ebn(byte[] bArr, byte[] bArr2) {
        this.b = new LinkedHashMap();
        this.a = new LinkedHashMap();
    }

    public ebn(djl djlVar) {
        this.b = djlVar;
        this.a = new ArrayList();
    }

    public ebn(uiq uiqVar) {
        this.a = uiqVar;
        this.b = new ogk((byte[]) null);
        uiqVar.a(this);
    }
}
