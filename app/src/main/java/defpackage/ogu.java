package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogu extends onw implements oeu, oev {
    private static final ojl h = ont.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final ohp d;
    public onz e;
    public ogc f;
    public final ojl g;

    public ogu(Context context, Handler handler, ohp ohpVar) {
        ojl ojlVar = h;
        this.a = context;
        this.b = handler;
        this.d = ohpVar;
        this.c = ohpVar.b;
        this.g = ojlVar;
    }

    @Override // defpackage.ofu
    public final void a(int i) {
        ogc ogcVar = this.f;
        oga ogaVar = (oga) ogcVar.e.k.get(ogcVar.b);
        if (ogaVar != null) {
            if (ogaVar.g) {
                ogaVar.l(new odj(17));
            } else {
                ogaVar.a(i);
            }
        }
    }

    @Override // defpackage.onw
    public final void c(oob oobVar) {
        this.b.post(new nzq(this, oobVar, 9, (char[]) null));
    }

    @Override // defpackage.ogq
    public final void i(odj odjVar) {
        this.f.b(odjVar);
    }

    @Override // defpackage.ofu
    public final void b() throws JSONException, NumberFormatException {
        GoogleSignInAccount googleSignInAccount;
        String str = CZAHo.XfY;
        onz onzVar = this.e;
        try {
            Account account = onzVar.t.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = onzVar.b;
                obx.a.lock();
                try {
                    if (obx.b == null) {
                        obx.b = new obx(context.getApplicationContext());
                    }
                    obx obxVar = obx.b;
                    obx.a.unlock();
                    String strA = obxVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = obxVar.a(str + strA);
                        if (strA2 != null) {
                            try {
                                if (!TextUtils.isEmpty(strA2)) {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String strOptString = jSONObject.optString("photoUrl");
                                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                                    long j = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int length = jSONArray.length();
                                    for (int i = 0; i < length; i++) {
                                        hashSet.add(new Scope(jSONArray.getString(i)));
                                    }
                                    String strOptString2 = jSONObject.optString("id");
                                    String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                    String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                    String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                    String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                    String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                    Long lValueOf = Long.valueOf(j);
                                    String string = jSONObject.getString("obfuscatedIdentifier");
                                    lValueOf.getClass();
                                    ojl.aw(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccount = null;
                } catch (Throwable th) {
                    obx.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = onzVar.u;
            ojl.ay(num);
            oiq oiqVar = new oiq(2, account, num.intValue(), googleSignInAccount);
            onx onxVar = (onx) onzVar.t();
            ooa ooaVar = new ooa(1, oiqVar);
            Parcel parcelA = onxVar.a();
            fbj.c(parcelA, ooaVar);
            fbj.d(parcelA, this);
            onxVar.A(12, parcelA);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new oob(1, new odj(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
