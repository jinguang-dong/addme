package defpackage;

import android.os.Build;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjm extends sjd {
    private static final boolean a = sjl.a();
    private static final boolean b;
    private static final sjc c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new sjk();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return sjl.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.sjd
    protected sif e(String str) {
        AtomicReference atomicReference = sjq.d;
        if (atomicReference.get() != null) {
            return ((sji) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        sjq sjqVar = new sjq(str);
        sjo.a.offer(sjqVar);
        if (atomicReference.get() == null) {
            return sjqVar;
        }
        sjq.e();
        return sjqVar;
    }

    @Override // defpackage.sjd
    protected sjc h() {
        return c;
    }

    @Override // defpackage.sjd
    protected ske j() {
        return sjr.a;
    }

    @Override // defpackage.sjd
    protected String m() {
        return OPuAVreQM.lhvNdFqfSx;
    }
}
