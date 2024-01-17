const axios = require('axios');

//------------------------------------------------------------------Données utiles au script-------------------
const TeamDataPost ={
    //Données Json à insérer dans la table teams

    teamName: 'Lakers',
    city : 'Los Angeles'

}

const TeamUpdate ={
    teamName: 'Clippers',
    city : 'Los Angeles'
}

const PlayerDataPost={
    //Données Json à insérer dans la table player

    firstName: 'Giannis',
    lastName : 'Antetokounmpo',
    position : 'Power Forward',
    age : '29'

}
const PlayerUpdate={
    //Données Json à update dans la table player

    firstName: 'Kevin',
    lastName : 'Durant',
    position : 'Small Forward',
    age : '35'

}

let teamId; // Stock l'ID d'une team
let playerId; // Stock l'ID d'un player

// Get Team
axios 
    .get("http://localhost:9000/teams")
    .then(response => {
        console.log('Teams : ', response.data);
        teamId = response.data[0].id;
    })
    .then(() => {
        //Update team
        axios.put(`http://localhost:9000/teams/${teamId+1}`, TeamUpdate)
            .then(putResponse => {
                console.log('Updated team:', putResponse.data);
            })
            .catch(error => {
                console.error('Error updating team:', error.response.data);
            });
    })
    .then(() => {
        // Delete Team
        axios.delete(`http://localhost:9000/teams/${teamId}`)
            .then(deleteResponse => {
                console.log('Deleted team:', deleteResponse.data);
            })
            .catch(error => {
                console.error('Error deleting team:', error.response.data);
            });
    });

// Post Team
axios
    .post("http://localhost:9000/teams", TeamDataPost)
    .then(postResponse => {
        console.log('Post team :', postResponse.data);
        teamId = postResponse.data.id;
    });

// Get Player
axios
    .get("http://localhost:9000/players")
    .then(response => {
        console.log('Players : ', response.data);
        playerId = response.data[0].id;
    })
    .then(() => {
        //Update player
        axios.put(`http://localhost:9000/players/${playerId+1}`, PlayerUpdate)
            .then(putResponse => {
                console.log('Updated player:', putResponse.data);
            })
            .catch(error => {
                console.error('Error updating player:', error.response.data);
            });
    })
    .then(() => {
        // Delete Player
        axios.delete(`http://localhost:9000/players/${playerId}`)
            .then(deleteResponse => {
                console.log('Deleted player:', deleteResponse.data);
            })
            .catch(error => {
                console.error('Error deleting player:', error.response.data);
            });
    });

// Post Player
axios
    .post("http://localhost:9000/players", PlayerDataPost)
    .then(postResponse => {
        console.log('Post player :', postResponse.data);
        playerId = postResponse.data.id;
    });

