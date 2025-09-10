package defpackage;

import android.animation.Animator;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ojl {
    private static Context a;
    private static Boolean b;

    public ojl() {
    }

    public static void A(Parcel parcel, int i, int i2) {
        z(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void B(Parcel parcel, int i, long j) {
        z(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void C(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeBundle(bundle);
        w(parcel, iV);
    }

    public static void D(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeByteArray(bArr);
        w(parcel, iV);
    }

    public static void E(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        w(parcel, iV);
    }

    public static void F(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeStrongBinder(iBinder);
        w(parcel, iV);
    }

    public static void G(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeIntArray(iArr);
        w(parcel, iV);
    }

    public static void H(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iV = v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        w(parcel, iV);
    }

    public static void I(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iV = v(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        w(parcel, iV);
    }

    public static void J(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeString(str);
        w(parcel, iV);
    }

    public static void K(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeStringArray(strArr);
        w(parcel, iV);
    }

    public static void L(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeStringList(list);
        w(parcel, iV);
    }

    public static void M(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iV = v(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                cm(parcel, parcelable, i2);
            }
        }
        w(parcel, iV);
    }

    public static void N(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iV = v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                cm(parcel, parcelable, 0);
            }
        }
        w(parcel, iV);
    }

    public static Map O(ContentResolver contentResolver, String[] strArr, oua ouaVar) throws oub {
        Uri uri = otv.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new oub("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new oub("ContentProvider query returned null cursor");
                    }
                    Map mapA = ouaVar.a(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapA.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new oub("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapA;
                } finally {
                }
            } catch (RemoteException e) {
                throw new oub(e);
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    public static oor P(Exception exc) {
        oow oowVar = new oow();
        oowVar.o(exc);
        return oowVar;
    }

    public static oor Q(Object obj) {
        oow oowVar = new oow();
        oowVar.p(obj);
        return oowVar;
    }

    public static Object R(oor oorVar, TimeUnit timeUnit) throws TimeoutException {
        if (lpa.y()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        az(timeUnit, "TimeUnit must not be null");
        if (oorVar.e()) {
            return cn(oorVar);
        }
        oox ooxVar = new oox();
        Executor executor = oov.b;
        oorVar.l(executor, ooxVar);
        oorVar.k(executor, ooxVar);
        oorVar.g(executor, ooxVar);
        if (ooxVar.a.await(2000L, timeUnit)) {
            return cn(oorVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static byte S(Parcel parcel, int i) {
        ah(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int T(int i) {
        return (char) i;
    }

    public static int U(Parcel parcel) {
        return parcel.readInt();
    }

    public static int V(Parcel parcel, int i) {
        ah(parcel, i, 4);
        return parcel.readInt();
    }

    public static int W(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int X(Parcel parcel) {
        int i = parcel.readInt();
        int iW = W(parcel, i);
        int iT = T(i);
        int iDataPosition = parcel.dataPosition();
        if (iT != 20293) {
            throw new oiy("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iW + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new oiy(a.bu(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long Y(Parcel parcel, int i) {
        ah(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle Z(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static oor aA(oez oezVar, oio oioVar) {
        pfl pflVar = new pfl((byte[]) null, (byte[]) null);
        oezVar.e(new oim(oezVar, pflVar, oioVar));
        return (oor) pflVar.a;
    }

    public static String aB(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void aC(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    public static oep aD(Status status) {
        return status.g != null ? new ofb(status) : new oep(status);
    }

    public static ogn aE(Object obj, Looper looper, String str) {
        az(looper, "Looper must not be null");
        az(str, "Listener type must not be null");
        return new ogn(looper, obj, str);
    }

    public static void aF(Status status, pfl pflVar) {
        aG(status, null, pflVar);
    }

    public static void aG(Status status, Object obj, pfl pflVar) {
        if (status.b()) {
            pflVar.d(obj);
        } else {
            pflVar.c(aD(status));
        }
    }

    public static boolean aH() {
        return Build.TYPE.equals("user");
    }

    public static int aI(View view) {
        return qpt.P(view, R.attr.colorOnBackground);
    }

    public static int aJ(View view) {
        return qpt.P(view, R.attr.colorOnPrimary);
    }

    public static int aK(View view) {
        return qpt.P(view, R.attr.colorOnPrimaryContainer);
    }

    public static int aL(View view) {
        return qpt.P(view, R.attr.colorOnSurface);
    }

    public static int aM(View view) {
        return qpt.P(view, R.attr.colorOnSurfaceVariant);
    }

    public static int aN(View view) {
        return qpt.P(view, R.attr.colorOnTertiaryContainer);
    }

    public static int aO(View view) {
        return qpt.P(view, android.R.attr.colorPrimary);
    }

    public static int aP(View view) {
        return qpt.P(view, R.attr.colorPrimaryContainer);
    }

    public static int aQ(View view) {
        return qpt.au(R.dimen.gm3_sys_elevation_level1, view.getContext());
    }

    public static int aR(View view) {
        return qpt.P(view, R.attr.colorSurfaceContainerLowest);
    }

    public static int aS(View view) {
        return qpt.P(view, R.attr.colorSurfaceVariant);
    }

    public static int aT(View view) {
        return qpt.P(view, R.attr.colorTertiaryContainer);
    }

    public static int aU(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static float aV(long j) {
        return j / 1000.0f;
    }

    public static int aW(double d) {
        return (int) (d * 1000.0d);
    }

    public static int aX(long j) {
        return (int) (j / 1000);
    }

    public static int aY(int i) {
        return i * 1000;
    }

    public static long aZ(int i) {
        return i * 1000000;
    }

    public static IBinder aa(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static Parcelable ab(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static String ac(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static ArrayList ad(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iW);
        return arrayList;
    }

    public static ArrayList ae(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList af(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void ag(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new oiy(a.bv(i, "Overread allowed size end="), parcel);
        }
    }

    public static void ah(Parcel parcel, int i, int i2) {
        int iW = W(parcel, i);
        if (iW == i2) {
            return;
        }
        throw new oiy("Expected size " + i2 + " got " + iW + " (0x" + Integer.toHexString(iW) + ")", parcel);
    }

    public static void ai(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + W(parcel, i));
    }

    public static boolean aj(Parcel parcel, int i) {
        ah(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ak(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static int[] al(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW);
        return iArrCreateIntArray;
    }

    public static Object[] am(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static String[] an(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static byte[][] ao(Parcel parcel, int i) {
        int iW = W(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iW);
        return bArr;
    }

    public static void aq(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void ar(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void as(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void at(String str) {
        if (!lpa.y()) {
            throw new IllegalStateException(str);
        }
    }

    public static void au(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void av(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void aw(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void ax(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void ay(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void az(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void bA(pdk pdkVar) throws InterruptedException {
        if (pdkVar.f() || pdkVar.i() || pdkVar.g()) {
            return;
        }
        pdz pdzVar = new pdz();
        pdkVar.j(pdzVar);
        pdzVar.cm();
    }

    public static void bB(phc phcVar, pec pecVar) {
        bC(phcVar, pecVar, "");
    }

    public static void bC(phc phcVar, pec pecVar, String str) {
        pdk pdkVarA = phcVar.a();
        if (pdkVarA != null) {
            bx(pdkVarA, pecVar, str);
        }
    }

    public static /* synthetic */ String bE(int i) {
        return i != 1 ? i != 2 ? "RESTRICT_VIBRATION_SOUND" : "RESTRICT_VIBRATION" : "NONE";
    }

    public static void bF(pbp pbpVar) {
        pbpVar.a();
    }

    public static void bG(pbn pbnVar, String str, Runnable runnable) {
        try {
            pbnVar.f(str);
            runnable.run();
        } finally {
            pbnVar.g();
        }
    }

    public static String bH() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < stackTrace.length; i++) {
            sb.append("\t");
            sb.append(stackTrace[i]);
            sb.append('\n');
        }
        return sb.toString();
    }

    public static String bI(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static String bJ(Class cls) {
        String simpleName = cls.getSimpleName();
        return simpleName.isEmpty() ? "Class" : simpleName;
    }

    public static Size bK(pas pasVar) {
        return new Size(pasVar.a, pasVar.b);
    }

    public static pas bL(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            return new pas(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static pas bM(List list) {
        rnt.L(!list.isEmpty());
        return (pas) Collections.max(list, bur.b);
    }

    public static String bN(pas pasVar) {
        return pasVar.a + "x" + pasVar.b;
    }

    public static List bO(Size[] sizeArr) {
        if (sizeArr == null) {
            int i = sbp.d;
            return sex.a;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            if (size != null) {
                arrayList.add(pas.g(size));
            }
        }
        return arrayList;
    }

    public static String bP(pjr pjrVar) {
        pjrVar.getClass();
        String str = pjrVar.a;
        str.getClass();
        pp.b(str);
        return str;
    }

    public static rwc bQ(oxj oxjVar, pjr pjrVar, int i, oxh oxhVar, rwc rwcVar, rwc rwcVar2, boolean z, boolean z2) {
        oxy oxyVarBT;
        oxy oxyVarA;
        if (oxhVar.g()) {
            oxv oxvVarA = oxv.a(oxjVar);
            oxvVarA.getClass();
            oxyVarBT = bS(pjrVar, oxvVarA);
        } else {
            oxw oxwVarA = oxw.a(oxjVar);
            oxwVarA.getClass();
            oxyVarBT = bT(pjrVar, oxwVarA);
        }
        int iBU = bU(oxyVarBT.g, oxjVar, i, rwcVar, rwcVar2);
        if (i == 5 || z2) {
            oxx oxxVarB = oxy.b(oxyVarBT);
            oxxVarB.i(5);
            oxxVarB.k(true == z2 ? 2 : 1);
            oxxVarB.j(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            oxxVarB.h(iBU);
            oxyVarA = oxxVarB.a();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(a.bv(i, "Unsupported video encoder type: "));
            }
            oxx oxxVarB2 = oxy.b(oxyVarBT);
            oxxVarB2.i(2);
            oxxVarB2.k(8);
            oxxVarB2.j(32768);
            oxxVarB2.h(iBU);
            oxyVarA = oxxVarB2.a();
        }
        if (z) {
            oxx oxxVarB3 = oxy.b(oxyVarA);
            oxxVarB3.d(3);
            oxxVarB3.c(2);
            oxxVarB3.b(192000);
            oxxVarB3.e(48000);
            oxyVarA = oxxVarB3.a();
        }
        return rwc.j(oxyVarA);
    }

    public static boolean bR(pjr pjrVar, oxv oxvVar) {
        return CamcorderProfile.hasProfile(Integer.parseInt(pjrVar.a), oxvVar.g);
    }

    public static oxy bS(pjr pjrVar, oxv oxvVar) {
        return oxy.a(CamcorderProfile.get(Integer.parseInt(pjrVar.a), oxvVar.g)).a();
    }

    public static oxy bT(pjr pjrVar, oxw oxwVar) {
        return oxy.a(CamcorderProfile.get(Integer.parseInt(pjrVar.a), oxwVar.n)).a();
    }

    public static int bU(int i, oxj oxjVar, int i2, rwc rwcVar, rwc rwcVar2) {
        int iRound;
        if (rwcVar2.h() && ((Integer) rwcVar2.c()).intValue() > 0) {
            return ((Integer) rwcVar2.c()).intValue();
        }
        if (oxjVar.equals(oxj.RES_2160P) && i < 48000000) {
            i = 48000000;
        }
        if (i2 == 2) {
            iRound = Math.round(i);
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(a.bv(i2, "Invalid codec type: "));
            }
            iRound = Math.round(i * 0.9f);
        }
        if (!rwcVar.h()) {
            return iRound;
        }
        int iRound2 = Math.round(iRound * ((Float) rwcVar.c()).floatValue());
        rwcVar.c().toString();
        return iRound2;
    }

    public static ovo bV(Executor executor) {
        return new ovo(executor, new pai() { // from class: ovl
            @Override // defpackage.pai
            public final Object a(Object obj) {
                return (ovp) ((Deque) obj).pollLast();
            }
        });
    }

    public static ExecutorService bW(String str) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(0);
        return bX(ovcVarA.a());
    }

    public static ExecutorService bX(ovd ovdVar) {
        int i = ovdVar.a;
        a.I(i >= 0);
        ThreadFactory threadFactoryCo = co(ovdVar);
        return i != 0 ? i != 1 ? Executors.newFixedThreadPool(i, threadFactoryCo) : Executors.newSingleThreadExecutor(threadFactoryCo) : Executors.newCachedThreadPool(threadFactoryCo);
    }

    public static ExecutorService bY(String str, int i) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(i);
        return bX(ovcVarA.a());
    }

    public static ExecutorService bZ(String str) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(1);
        return bX(ovcVarA.a());
    }

    public static long ba(long j) {
        return j / 1000000;
    }

    public static pmv bb(int i) {
        return new pmv(new nno(i));
    }

    public static void bc(float[] fArr, nng nngVar) {
        double dCos;
        a.I(fArr.length == 3);
        float f = fArr[0];
        double d = f;
        float f2 = fArr[1];
        double d2 = f2;
        float f3 = fArr[2];
        double d3 = f3;
        float f4 = (f * f) + (f2 * f2) + (f3 * f3);
        if (f4 > 0.0f) {
            double dSqrt = Math.sqrt(f4);
            double d4 = 0.5d * dSqrt;
            double dSin = Math.sin(d4) / dSqrt;
            nngVar.a = d * dSin;
            nngVar.b = d2 * dSin;
            nngVar.c = d3 * dSin;
            dCos = Math.cos(d4);
        } else {
            nngVar.a = d * 0.5d;
            nngVar.b = d2 * 0.5d;
            nngVar.c = d3 * 0.5d;
            dCos = 1.0d;
        }
        nngVar.d = dCos;
    }

    public static void bd(nng nngVar, float[] fArr) {
        a.I(true);
        double d = nngVar.a;
        double d2 = nngVar.b;
        double d3 = nngVar.c;
        double d4 = (d * d) + (d2 * d2) + (d3 * d3);
        if (d4 <= 0.0d) {
            fArr[0] = (float) (d + d);
            fArr[1] = (float) (d2 + d2);
            fArr[2] = (float) (d3 + d3);
            return;
        }
        double dSqrt = Math.sqrt(d4);
        double d5 = nngVar.d;
        double dAtan2 = d5 < 0.0d ? Math.atan2(-dSqrt, -d5) : Math.atan2(dSqrt, d5);
        double d6 = (dAtan2 + dAtan2) / dSqrt;
        fArr[0] = (float) (d * d6);
        fArr[1] = (float) (d2 * d6);
        fArr[2] = (float) (d3 * d6);
    }

    public static Range be(List list, final boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Range range = (Range) it.next();
            if (((Integer) range.getUpper()).intValue() <= 30) {
                arrayList.add(range);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: nmq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Range range2 = (Range) obj;
                Range range3 = (Range) obj2;
                return ((Integer) range3.getUpper()).compareTo((Integer) range2.getUpper()) == 0 ? z ? ((Integer) range2.getLower()).compareTo((Integer) range3.getLower()) : ((Integer) range3.getLower()).compareTo((Integer) range2.getLower()) : ((Integer) range3.getUpper()).compareTo((Integer) range2.getUpper());
            }
        });
        if (arrayList.isEmpty()) {
            throw new UnsupportedOperationException("No fps range with upper value at or below 30fps.");
        }
        return (Range) arrayList.get(0);
    }

    public static void bf(boolean z, boolean z2, nkw nkwVar, imi imiVar, nan nanVar, Context context) {
        if (!z || z2) {
            imiVar.f(nanVar);
            return;
        }
        if (nkwVar == nkw.PHOTO || nkwVar == nkw.IMAGE_INTENT || nkwVar == nkw.PORTRAIT || nkwVar == nkw.NIGHT_SIGHT || nkwVar == nkw.LANDSCAPE || nkwVar == nkw.ACTION_PAN || nkwVar == nkw.COTTAGE || nkwVar == nkw.SERENGETI) {
            imiVar.f(nanVar);
            nanVar.l(context.getString(R.string.underwater_color_on_photo_chip_text));
            imiVar.a(nanVar);
        } else {
            if (!nkwVar.c()) {
                imiVar.f(nanVar);
                return;
            }
            imiVar.f(nanVar);
            nanVar.l(context.getString(R.string.underwater_color_on_video_chip_text));
            imiVar.a(nanVar);
        }
    }

    public static /* bridge */ /* synthetic */ nlu bg(Animator animator) {
        animator.getClass();
        return new nlw(animator);
    }

    public static Point bh(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Point bi(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Collection bj(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        return arrayList;
    }

    public static boolean bk(PointF pointF, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains((int) pointF.x, (int) pointF.y);
    }

    public static void bl(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static adt bm() {
        return byi.bg(0, 0, acm.a, 2);
    }

    public static adt bn(mxm mxmVar, mxm mxmVar2, boolean z) {
        mxmVar.getClass();
        mxmVar2.getClass();
        float fAL = qpt.aL(qpt.aN(mxmVar), qpt.aN(mxmVar2));
        return byi.bg((fAL <= 0.0f || fAL > 90.0f || z) ? 0 : 250, 0, acm.a, 2);
    }

    public static long bo(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            pil pilVar = (pil) ((peo) it.next());
            long jG = pilVar.g();
            rnt.u(jG >= 0, "bytesPerImage() must be >= 0", new Object[0]);
            if (!pilVar.j()) {
                j += jG;
            }
        }
        return j;
    }

    public static qt bp(long j) {
        if (j != -1) {
            return new qt(j);
        }
        return null;
    }

    public static qx bq(long j) {
        if (j != -1) {
            return new qx(j);
        }
        return null;
    }

    public static List br(int i) {
        return i != -1 ? ske.bj(new qw(i)) : ufw.a;
    }

    public static qy bs(int i) {
        if (i - 1 != 0) {
            return new qy();
        }
        return null;
    }

    public static boolean bt(pdv pdvVar, pdv pdvVar2, pbc pbcVar) {
        boolean z = true;
        if (pdvVar2 != pdvVar && !pdvVar.c().isEmpty()) {
            scn<pej> scnVar = ((pgb) pdvVar2).d;
            if (!scnVar.isEmpty()) {
                loop0: for (pej pejVar : scnVar) {
                    for (pej pejVar2 : pdvVar.c()) {
                        if (pejVar.a.equals(pejVar2.a)) {
                            Object obj = pejVar.b;
                            Object obj2 = pejVar2.b;
                            if (!obj.equals(obj2)) {
                                z = false;
                                if (pbcVar == null) {
                                    break loop0;
                                }
                                pbcVar.d(bI("%s on %s (%s) conflicts with %s (%s)", pejVar2.a(), pdvVar, obj2, pdvVar2, obj));
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public static /* synthetic */ String bu(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOCKED" : "CONVERGED" : "IMMEDIATE_LOCKED" : "ANY";
    }

    public static peb bv(pdk pdkVar) {
        pea peaVar = new pea();
        pdkVar.j(peaVar);
        return peaVar;
    }

    public static void bw(pdk pdkVar, Runnable runnable) {
        pdkVar.j(new pdw(runnable));
    }

    public static void bx(pdk pdkVar, pec pecVar, String str) {
        pdkVar.j(new pdx(str, pecVar, pdkVar));
    }

    public static void by(pdk pdkVar) throws InterruptedException {
        if (pdkVar.f() || pdkVar.g()) {
            return;
        }
        bv(pdkVar).cm();
    }

    public static void bz(pdk pdkVar) throws InterruptedException {
        if (pdkVar.f() || pdkVar.h() || pdkVar.g()) {
            return;
        }
        pdy pdyVar = new pdy();
        pdkVar.j(pdyVar);
        pdyVar.cm();
    }

    public static ScheduledExecutorService ca(ovd ovdVar) {
        int i = ovdVar.a;
        a.I(i > 0);
        ThreadFactory threadFactoryCo = co(ovdVar);
        return !ovdVar.d ? new ScheduledThreadPoolExecutor(i, threadFactoryCo) : new ovf(i, threadFactoryCo);
    }

    public static ScheduledExecutorService cb(String str, int i) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(i);
        return ca(ovcVarA.a());
    }

    public static ScheduledExecutorService cc(String str) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(1);
        return ca(ovcVarA.a());
    }

    public static ExecutorService cd(String str, int i) {
        ovc ovcVarA = ovd.a();
        ovcVarA.a = str;
        ovcVarA.c(2);
        ovcVarA.b(i);
        return bX(ovcVarA.a());
    }

    public static Executor ce() {
        return new oux(new out());
    }

    public static Handler cf(our ourVar, String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        handlerThread.start();
        ourVar.d(new ouq(handlerThread, 0));
        return new Handler(handlerThread.getLooper());
    }

    public static Handler cg(our ourVar, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        ourVar.d(new ouq(handlerThread, 0));
        return new Handler(handlerThread.getLooper());
    }

    public static syu ch(syu syuVar, syu syuVar2, pah pahVar) {
        ouo ouoVar = new ouo(pahVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(syuVar);
        arrayList.add(syuVar2);
        return swz.j(ske.I(arrayList), new jmx(ouoVar, 9), sxo.a);
    }

    public static Object ci(syu syuVar) {
        Object obj = null;
        if (!syuVar.isDone() || syuVar.isCancelled()) {
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = syuVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException unused2) {
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void cj(syu syuVar, paf pafVar) {
        ck(syuVar, pafVar, sxo.a);
    }

    public static void ck(syu syuVar, paf pafVar, Executor executor) {
        ske.W(syuVar, new oum(pafVar), executor);
    }

    public static void cl(syu syuVar, syu syuVar2, oun ounVar, Executor executor) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(syuVar);
        arrayList.add(syuVar2);
        swz.j(ske.I(arrayList), new jmx(ounVar, 8), executor);
    }

    private static void cm(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static Object cn(oor oorVar) throws ExecutionException {
        if (oorVar.f()) {
            return oorVar.d();
        }
        if (((oow) oorVar).c) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(oorVar.c());
    }

    private static ThreadFactory co(ovd ovdVar) {
        boolean z = ovdVar.a == 1;
        boolean z2 = z || ovdVar.b.length() <= 13;
        String str = ovdVar.b;
        if (z2) {
            return new ove(ovdVar, z);
        }
        throw new IllegalArgumentException(rnt.z("Thread name %s is too long, must be less than %s", str, 13));
    }

    public static StrictMode.VmPolicy.Builder r(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static synchronized boolean s(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static int t(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static int u(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static int v(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void w(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void x(Parcel parcel, int i, boolean z) {
        z(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void y(Parcel parcel, int i, byte b2) {
        z(parcel, i, 4);
        parcel.writeInt(b2);
    }

    public static void z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public void a(poe poeVar) {
    }

    public String bD() {
        return "Frame.Listener";
    }

    public void dG(peo peoVar, long j) {
    }

    public void dH(piw piwVar) {
    }

    public void dI() {
    }

    public void dJ() {
    }

    public void dT(pnx pnxVar) {
    }

    public void dU(poe poeVar) {
    }

    public void dV(Set set) {
    }

    public void dW() {
    }

    public Executor dX() {
        return null;
    }

    public void dY() {
    }

    @Deprecated
    public oeo eO(Context context, Looper looper, ohp ohpVar, Object obj, oeu oeuVar, oev oevVar) {
        return q(context, looper, ohpVar, obj, oeuVar, oevVar);
    }

    public void eP() {
    }

    public void l(pdo pdoVar) {
    }

    public void m(long j) {
    }

    public void n() {
    }

    public oeo q(Context context, Looper looper, ohp ohpVar, Object obj, ofu ofuVar, ogq ogqVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public ojl(short[] sArr) {
    }

    public static void ap(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new oiy(GAQqzWiWWcYOgy.KboLRAwgePF + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public ojl(byte[] bArr, short[] sArr) {
        new CopyOnWriteArraySet();
    }

    public ojl(pjo pjoVar) {
        ((Integer) pjoVar.n(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
    }
}
