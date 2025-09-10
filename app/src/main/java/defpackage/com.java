package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.ar.core.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class com {
    public com() {
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.WindowInsetsController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.WindowInsetsController, java.lang.Object] */
    public static void d(boolean z, cpq cpqVar) {
        if (z) {
            if (cpqVar.b != null) {
                cpqVar.a(16);
            }
            cpqVar.a.setSystemBarsAppearance(16, 16);
        } else {
            if (cpqVar.b != null) {
                cpqVar.b(16);
            }
            cpqVar.a.setSystemBarsAppearance(0, 16);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.WindowInsetsController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.WindowInsetsController, java.lang.Object] */
    public static void e(boolean z, cpq cpqVar) {
        if (z) {
            if (cpqVar.b != null) {
                cpqVar.a(8192);
            }
            cpqVar.a.setSystemBarsAppearance(8, 8);
        } else {
            if (cpqVar.b != null) {
                cpqVar.b(8192);
            }
            cpqVar.a.setSystemBarsAppearance(0, 8);
        }
    }

    public static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] g(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = z(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<ctr> r2 = defpackage.ctr.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            ctr[] r1 = (defpackage.ctr[]) r1
            if (r1 == 0) goto L47
            int r2 = r1.length
            if (r2 <= 0) goto L47
            r3 = r0
        L28:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L39
            if (r5 == r7) goto L42
            goto L3b
        L39:
            if (r4 == r7) goto L42
        L3b:
            if (r7 <= r5) goto L3f
            if (r7 < r4) goto L42
        L3f:
            int r3 = r3 + 1
            goto L28
        L42:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.com.h(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[EDGE_INSN: B:90:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f], EDGE_INSN: B:91:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f, LOOP_LABEL: LOOP:2: B:44:0x006a->B:54:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.com.i(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = j(file2) && z;
        }
        return z;
    }

    public static czb k(long j) {
        return new czb("auxiliary.tracks.offset", rup.w(j), 78);
    }

    public static ByteBuffer l(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer m(String str, List list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += ((ByteBuffer) list.get(i)).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer n(String str, ByteBuffer byteBuffer) {
        return o(str.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }

    public static ByteBuffer o(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static Interpolator r(Context context, int i) throws Resources.NotFoundException {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        coe.f(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }

    public static void s(dgm dgmVar, dgp dgpVar) {
        dgmVar.b(dgpVar);
    }

    public static void t(dgm dgmVar, dgp dgpVar) {
        dgmVar.e(dgpVar);
    }

    public static void u(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.transition_current_scene, null);
    }

    public static Path v(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static ObjectAnimator w(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }

    public static void x(dff dffVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dffVar.f(i);
                } else if (obj instanceof byte[]) {
                    dffVar.c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dffVar.d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    dffVar.d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dffVar.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    dffVar.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    dffVar.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dffVar.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    dffVar.g(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    dffVar.e(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }

    public static ByteBuffer y(qev qevVar) {
        ByteBuffer byteBuffer = (ByteBuffer) qevVar.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        byteBufferAllocate.put((byte) ((qevVar.a << 3) | 2));
        int iRemaining = byteBuffer.remaining();
        a.I(iRemaining > 0);
        int i = iRemaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        coi.x(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iRemaining & 127;
            iRemaining >>= 7;
            if (iRemaining != 0) {
                i4 |= 128;
            }
            byteBufferAllocate2.put((byte) i4);
        }
        byteBufferAllocate2.flip();
        byteBufferAllocate.put(byteBufferAllocate2);
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static boolean z(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int[] iArr) {
        return false;
    }

    public com(byte[] bArr) {
    }
}
