package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.ViewOverlay;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.lang.reflect.Method;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bfw implements uif {
    private final /* synthetic */ int a;

    public /* synthetic */ bfw(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uif
    public final Object a() throws NoSuchMethodException, SecurityException {
        Class<?> returnType;
        WindowLayoutComponent windowLayoutComponentI;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new bfv(bArr);
            case 1:
                ayi.g(cdVQ.wuj);
                throw new uer();
            case 2:
            case 3:
                return null;
            case 4:
                return cdi.d;
            case 5:
                ayp aypVar = cxu.a;
                throw new IllegalStateException(qcjAcSmlN.ozgaBOhrNrUPAO);
            case 6:
                return ufg.a;
            case 7:
                return ufg.a;
            case 8:
                int i = ddi.h;
                return true;
            case 9:
                ayp aypVar2 = dew.a;
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 10:
                String[] strArr = dfj.a;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 11:
                String[] strArr2 = dfj.a;
                try {
                    Method methodN = cog.n();
                    if (methodN != null && (returnType = methodN.getReturnType()) != null) {
                        return returnType.getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
                    }
                } catch (Throwable unused2) {
                }
                return null;
            case 12:
                ues uesVar = duu.a;
                try {
                    ClassLoader classLoader = duv.class.getClassLoader();
                    got gotVar = classLoader != null ? new got(classLoader, new duf(classLoader)) : null;
                    if (gotVar != null && (windowLayoutComponentI = gotVar.i()) != null) {
                        duf dufVar = new duf(classLoader);
                        int i2 = dug.a;
                        int iA = dug.a();
                        return iA >= 9 ? new dvg(windowLayoutComponentI, dufVar) : iA >= 6 ? new dvg(windowLayoutComponentI, dufVar) : iA >= 2 ? new dvg(windowLayoutComponentI, dufVar) : iA == 1 ? new dvf(windowLayoutComponentI, dufVar) : new dve();
                    }
                } catch (Throwable unused3) {
                }
                return null;
            case 13:
                int i3 = gwv.Y;
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                throw new IllegalStateException("SupermodeSwitcherComponent is not provided. Make sure the top-level composable is wrapped with a composition local provider that provides SupermodeSwitcherComponent.");
            default:
                una unaVar = rfc.a;
                try {
                    Method declaredMethod2 = ViewOverlay.class.getDeclaredMethod("getOverlayView", null);
                    declaredMethod2.setAccessible(true);
                    bArr = declaredMethod2;
                } catch (NoSuchMethodException unused4) {
                    Log.w(rfg.a, "Can't access ViewOverlay, run \"adb shell settings put global hidden_api_policy 0\" to access more view properties, see https://developer.android.com/guide/app-compatibility/restrictions-non-sdk-interfaces#how_can_i_enable_access_to_non-sdk_interfaces");
                }
                return new ndd(bArr, 13);
        }
    }
}
